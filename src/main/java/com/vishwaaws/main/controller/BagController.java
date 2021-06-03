package com.vishwaaws.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.vishwaaws.main.model.Bag;

@RestController
@RequestMapping("/things")
public final class BagController {

    private final Bag bag = new Bag();

    @GetMapping
    public Bag getBag() {
        return bag;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addThing(@RequestBody final String something) {
        bag.add(something);
    }

    @DeleteMapping
    public void removeEverything() {
        bag.removeEverything();
    }
}
