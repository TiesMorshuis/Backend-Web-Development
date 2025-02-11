package com.mycompany.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzExecutorTest {
    FizzBuzzExecutor sut;
    @BeforeEach

    void setup(){
        sut = new FizzBuzzExecutor();
    }

    @Test
    void (){
        var testValue = sut.execute(303);
        Assertions.assertEquals("Buzz", testValue);
    }
}
