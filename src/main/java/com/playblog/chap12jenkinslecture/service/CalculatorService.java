package com.playblog.chap12jenkinslecture.service;

import com.playblog.chap12jenkinslecture.dto.CalculatorDto;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plusTwoNumbers(CalculatorDto calculatorDto) {
        return calculatorDto.getNum1() + calculatorDto.getNum2();
    }
}
