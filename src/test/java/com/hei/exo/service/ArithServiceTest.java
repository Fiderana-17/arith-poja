package com.hei.exo.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArithmeticServiceTest {
    private final ArithmeticService arithmeticService = new ArithmeticService();

    @Test
    void add_two_positive_numbers_ok() {
        assertEquals(14, arithmeticService.add(10, 4));
    }

    @Test
    void add_any_negative_number_ko() {
        assertThrows(IllegalArgumentException.class, () -> arithmeticService.add(-1, 2));
    }

    @Test
    void subtract_two_positive_numbers_ok() {
        assertEquals(6, arithmeticService.subtract(10, 4));
    }

    @Test
    void subtract_any_negative_number_ko() {
        assertThrows(IllegalArgumentException.class, () -> arithmeticService.subtract(-1, 2));
    }

    @Test
    void multiply_two_positive_numbers_ok() {
        assertEquals(40, arithmeticService.multiply(10, 4));
    }

    @Test
    void multiply_any_negative_number_ko() {
        assertThrows(IllegalArgumentException.class, () -> arithmeticService.multiply(-1, 2));
    }

    @Test
    void divide_two_positive_numbers_ok() {
        assertEquals(2.5, arithmeticService.divide(10, 4));
    }

    @Test
    void divide_by_zero_ko() {
        assertThrows(IllegalArgumentException.class, () -> arithmeticService.divide(10, 0));
    }

    @Test
    void divide_any_negative_number_ko() {
        assertThrows(IllegalArgumentException.class, () -> arithmeticService.divide(-1, 2));
    }
}