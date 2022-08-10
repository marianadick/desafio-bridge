package com.example.number_challenge.service;

import com.example.number_challenge.DAO.NumberDTO;
import com.example.number_challenge.repository.NumberRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

import com.example.number_challenge.model.Number;

import javax.validation.Valid;

@Service
public class NumberService {

    final
    NumberRepository numberRepository;

    public NumberService(NumberRepository numberRepository) {
        this.numberRepository = numberRepository;
    }

    public NumberDTO calculateFinalResult(@Valid NumberDTO number) {
        int count = 0;
        for (int i = 2; i < number.getK(); i++) {
            if (calculateDivisors(i) == calculateDivisors((i+1))) {
                count += 1;
            }
        }
        number.setResult(count);
        return number;
    }

    public LinkedList<Integer> findPrimeFactors(int n) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        while (n%2==0) {
            result.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            while (n%i==0) {
                result.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            result.add(n);
        }

        return result;
    }

    public int calculateDivisors(int n) {
        LinkedList<Integer> primeFactors = findPrimeFactors(n);
        primeFactors.add(-1);
        int result = 1;
        int aux = 0;
        int count = 0;

        for (int factor: primeFactors) {
            if (aux == 0) {
                aux = factor;
                count += 1;
            }

            else if (aux == factor) {
                count += 1;
            }

            else {
                result *= (count+1);
                count = 1;
                aux = factor;
            }

        }

        return result;
    }

    public void saveNumber(Number number) {
        numberRepository.save(number);
    }

    public List<Number> getResult() {
        return numberRepository.findAll();
    }
}
