package com.hei.exo.endpoint.rest.controller.arith;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hei.exo.service.ArithmeticService;

@RestController
@AllArgsConstructor
public class ArithController {
    private final ArithmeticService arithmeticService;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return arithmeticService.add(a, b);
    }

    @PostMapping("/add")
    public int addPost(@RequestParam int a, @RequestParam int b) {
        return arithmeticService.add(a, b);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return arithmeticService.subtract(a, b);
    }

    @PostMapping("/subtract")
    public int subtractPost(@RequestParam int a, @RequestParam int b) {
        return arithmeticService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return arithmeticService.multiply(a, b);
    }

    @PostMapping("/multiply")
    public int multiplyPost(@RequestParam int a, @RequestParam int b) {
        return arithmeticService.multiply(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b) {
        return arithmeticService.divide(a, b);
    }

    @PostMapping("/divide")
    public double dividePost(@RequestParam int a, @RequestParam int b) {
        return arithmeticService.divide(a, b);
    }
}