package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(result(args));
    }
    public static String result (String [] data){
        if(data.length == 0){
            throw new IllegalArgumentException("Enter up to 10 digits.");
        }
        if(data.length > 10){
            throw new IllegalArgumentException("Enter a maximum of 10 digits");
        }
        int [] arr = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            arr [i] = Integer.parseInt(data[i]);
        }
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }
}