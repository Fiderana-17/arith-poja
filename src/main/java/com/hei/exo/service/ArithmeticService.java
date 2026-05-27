package com.hei.exo.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {

    private void validate(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Numbers must be positive");
        }
    }

    public int add(int a, int b) {
        validate(a, b);
        return a + b;
    }

    public int subtract(int a, int b) {
        validate(a, b);
        return a - b;
    }

    public int multiply(int a, int b) {
        validate(a, b);
        return a * b;
    }
}