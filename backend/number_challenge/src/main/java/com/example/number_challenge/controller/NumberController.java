package com.example.number_challenge.controller;

import com.example.number_challenge.DAO.NumberDTO;
import com.example.number_challenge.service.NumberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.number_challenge.model.Number;
import com.example.number_challenge.DAO.NumberDTO;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class NumberController {
    @Autowired
    NumberService numService;

    @RequestMapping(value="/input", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public NumberDTO calculate(@Valid @RequestBody NumberDTO input) {
        long startTime = System.nanoTime();
        System.out.println(input.getK());
        NumberDTO result = numService.calculateFinalResult(input);
        long elapsedTime = System.nanoTime() - startTime;
        elapsedTime /= 1000000000;
        result.setTime(elapsedTime);
        var numberModel = new Number();
        result.setK(input.getK());
        BeanUtils.copyProperties(result, numberModel);
        numService.saveNumber(numberModel);
        return result;
    }
    @RequestMapping(value="/getresults", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Number> getHistory() {
        return numService.getResult();
    }
}
