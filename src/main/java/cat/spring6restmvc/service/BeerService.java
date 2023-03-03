package cat.spring6restmvc.service;

import cat.spring6restmvc.model.Beer;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.UUID;


public interface BeerService {

    List<Beer> listBeers();

    Beer getBeerById(UUID id);

    Beer saveNewBeer(Beer beer);

    Beer updateBeerById(UUID beerId, Beer beer);

    Beer deleteBeerById(UUID beerId);

    void patchBeerById(UUID beerId, Beer beer);
}
