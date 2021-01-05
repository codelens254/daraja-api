package com.codelens.darajaapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class SampleController {

    @GetMapping(produces = "application/json")
    public String getSampleMessage(){
        return "Sample Controller Working";
    }
}
