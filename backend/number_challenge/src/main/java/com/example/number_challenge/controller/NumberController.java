package com.example.number_challenge.controller;

import com.example.number_challenge.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.number_challenge.model.Number;

import javax.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/")
public class NumberController {
    @Autowired
    NumberService numService;
    @RequestMapping(value="/input", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Number calculate(@Valid @RequestBody Number input) {
        long startTime = System.nanoTime();
        System.out.println(input.getK());
        Number result = numService.calculateFinalResult(input);
        long elapsedTime = System.nanoTime() - startTime;
        result.setTime(elapsedTime);
        return result;
    }
}
