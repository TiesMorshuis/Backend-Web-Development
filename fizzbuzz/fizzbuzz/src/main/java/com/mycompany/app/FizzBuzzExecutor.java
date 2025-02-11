package com.mycompany.app;

public class FizzBuzzExecutor {
    public String execute(int i){
        if(i % 3 == 0 && i % 5 == 0 && i != 0){
            return "FizzBuzz";
        } else if (i % 3 == 0){
            return "Fizz";
        } else if (i % 5 == 0){
            return "Bizz";
        } else {
            return String.valueOf(i);
        }

    }
}
