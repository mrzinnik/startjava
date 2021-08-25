package com.startjava.lesson_1.unicode;

public class Unicode {
    
    public static void main(String[] args) {
        char symbol;
        for(int i = 33; i <= 126; i++) {
            symbol = (char) i;
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
}