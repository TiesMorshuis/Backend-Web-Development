package com.mycompany.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator sut;
    @BeforeEach
    void setUp() {
        sut = new StringCalculator();
    }

    @Test
    void addEmptyStringShouldReturnZero() {
        int result = sut.add("");
        Assertions.assertEquals(0, result);
    }

    @Test
    void addStringOfOneShouldReturnOne(){
        int result = sut.add("1");

        Assertions.assertEquals(1, result);
    }

    @Test
    void addStringOfTwoShouldReturnThree(){
        int result = sut.add("3");
        Assertions.assertEquals(3, result);
    }
    @Test
    void addStringShouldReturnFortySeven(){
        int result = sut.add("");
        Assertions.assertEquals(3, result);
    }
}