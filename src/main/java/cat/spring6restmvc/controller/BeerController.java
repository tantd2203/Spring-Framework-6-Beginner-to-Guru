package cat.spring6restmvc.controller;

import cat.spring6restmvc.model.Beer;
import cat.spring6restmvc.service.BeerService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
@AllArgsConstructor
public class BeerController {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(BeerController.class);
    private final BeerService beerService;
    public Beer getBeerById(UUID id){
        log.debug("Get Beer by Id - in controller");

        return beerService.getBeerById(id);
    }

}
