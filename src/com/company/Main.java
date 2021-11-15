package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        double[] array = new double[5];
        for (int i=0; i<array.length; i++) {
            array[i] = (double) (Math.random() * 10);
        }
         System.out.println(Arrays.toString(array));

    }
}
