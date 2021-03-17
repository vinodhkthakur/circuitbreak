package com.vintech.dev.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @GetMapping("/item")
    public String getItem() {
        return "In the Item service selected";
    }

}


