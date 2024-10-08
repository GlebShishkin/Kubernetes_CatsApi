package com.example.catsapi.controller;

import com.example.catsapi.dto.CatDto;
import com.example.catsapi.entity.Cat;
import com.example.catsapi.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService service;

    @PostMapping("/save")
    public Cat save(@RequestBody CatDto cat) {
        return service.save(cat);
    }

    @GetMapping("/getAll")
    public Iterable<Cat> getAll() {
        System.out.println("######################");
        return service.getAll();
    }

}