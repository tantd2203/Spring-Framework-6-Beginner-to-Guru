package cat.spring6restmvc.controller;

import cat.spring6restmvc.controller.BeerController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class BeerControllerTest {
    @Autowired
    BeerController beerController;
    @Test
    void getBeerById() {
        System.out.println(beerController.getBeerById(UUID.randomUUID()));

    }
}