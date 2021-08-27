package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];

    private int lastNumberIndex = -1;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, lastNumberIndex + 1);
    }

    public int getNumber() {
        return numbers[lastNumberIndex];
    }

    public int getLastNumberIndex() {
        return lastNumberIndex;
    }

    public void setNumber(int number) {
        if(lastNumberIndex < 9) {
            lastNumberIndex++;
        }
        this.numbers[lastNumberIndex] = number;
        if(lastNumberIndex == 9) {
            System.out.println(name + " used the last attempt!");
        }
    }

    public void resetAttempts() {
        if(lastNumberIndex >= 0) {
            Arrays.fill(numbers, 0, lastNumberIndex, 0);
        }
        lastNumberIndex = -1;
    }
}