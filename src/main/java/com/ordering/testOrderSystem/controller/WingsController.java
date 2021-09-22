package com.ordering.testOrderSystem.controller;

import com.ordering.testOrderSystem.entity.Wings;
import com.ordering.testOrderSystem.service.WingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WingsController {
    private final WingsService wingsService;

    @Autowired
    public WingsController(@Qualifier("wingsServiceImpl") WingsService wingsService) {
        this.wingsService = wingsService;
    }

    @RequestMapping("/")
    public String getHome() {
        return "Home";
    }

    @GetMapping("/item/{id}")
    public Wings wingsByID(@PathVariable("id") String id) {
        return wingsService.wingsList().get(Integer.parseInt(id)-1);
    }

    //http://localhost:8080
    @GetMapping("/listOfWings")
    public List<Wings> wingsList() {
        return wingsService.wingsList();
    }

    @PostMapping("/addWings")
    public Wings addWings(@RequestBody Wings wings) {
        wings.setId(0);
        wingsService.saveOrUpdate(wings);
        return wings;
    }

    @PutMapping("/updateWings")
    public Wings updateWings(@RequestBody Wings wings) {
        wingsService.saveOrUpdate(wings);
        return wings;
    }

    @DeleteMapping("/deleteWings")
    public String deleteWings(@PathVariable int wingsId) {
        wingsService.deleteWings(wingsId);
        return "Deleted wings menu item with id: " + wingsId;
    }


}
