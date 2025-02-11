package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[] intList = {1, 2, 3, 4};
        ArrayList aantalList = new ArrayList<>();
        for (int i = 0; i <intList.length; i++){
            if (intList[i] % 2 == 0){
                int counter = 0;
                for (int j = 0; j < intList[i]; j++){
                System.out.println(intList[i]);
                counter += 1;
                }
                counter = counter / 2;
                aantalList.add(counter);
            }
        }
        System.out.println(aantalList);
    }
}
