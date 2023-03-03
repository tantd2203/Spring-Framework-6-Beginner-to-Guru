package cat.spring6restmvc.controller;


import cat.spring6restmvc.model.Beer;
import cat.spring6restmvc.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@Controller
@AllArgsConstructor
@RestController
@Slf4j
@RequestMapping("/api/v1/beer")
public class BeerController {
    private final BeerService beerService;

    @RequestMapping(method = RequestMethod.GET,value = "/{beerID}")
    public Beer getBeerById(@PathVariable("beerID") UUID id){
        return beerService.getBeerById(id);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> listBeers (){
        return  beerService.listBeers();
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity handlePost(@RequestBody Beer beer){
        Beer savedBeer =beerService.saveNewBeer(beer);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location" ,"/api/v1/beer/" +savedBeer.getId().toString());
        return  new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{beerId}")
    public  ResponseEntity handlePut (@PathVariable("beerId") UUID beerId, @RequestBody Beer beer){
               Beer updateBeer = beerService.updateBeerById(beerId ,beer);
            return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(method = RequestMethod.DELETE ,value = "/{beerId}")
    public  ResponseEntity handleDelete (@PathVariable("beerId") UUID beerId){
            Beer deleteById = beerService.deleteBeerById(beerId);
        return   new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("{beerId}")
    public ResponseEntity updateBeerPatchById(@PathVariable("beerId")UUID beerId, @RequestBody Beer beer){

        beerService.patchBeerById(beerId, beer);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }



}