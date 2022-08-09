package com.example.number_challenge.controller;

import com.example.number_challenge.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.number_challenge.model.Number;

@RestController
@RequestMapping("/")
public class NumberController {
    @Autowired
    NumberService numService;
    @RequestMapping(value="/input", method = RequestMethod.POST)
    public Number calculate(@RequestBody Number input) {
        long startTime = System.nanoTime();
        Number result = numService.calculateFinalResult(input);
        long elapsedTime = System.nanoTime() - startTime;
        result.setTime(elapsedTime);
        return result;
    }
}
