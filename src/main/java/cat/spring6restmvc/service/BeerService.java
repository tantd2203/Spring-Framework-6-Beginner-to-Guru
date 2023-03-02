package cat.spring6restmvc.service;

import cat.spring6restmvc.model.Beer;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;


public interface BeerService {

    Beer getBeerById(UUID id);
}
