package com.hei.exo.endpoint.rest.controller.arith;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hei.exo.service.ArithmeticService;

@RestController
@AllArgsConstructor
public class ArithController {
    private final ArithmeticService arithmeticService;

    @GetMapping("/add")
    public int add(int a, int b) {
        return arithmeticService.add(a, b);
    }

}