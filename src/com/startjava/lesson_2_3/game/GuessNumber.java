package com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    
    private Player playerOne;
    private Player playerTwo;
    private int computerNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public int getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(int computerNumber) {
        this.computerNumber = computerNumber;
    }

    public void startGame() {
        System.out.println("Start!");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        computerNumber = 1 + random.nextInt(100);
        System.out.println("/*Test: computerNumber = " + computerNumber + "*/");
        while(true) {
            System.out.print(playerOne.getName() + ": ");
            playerOne.setNumber(Integer.parseInt(scan.nextLine()));
            if(playerOne.getNumber() == computerNumber) {
                System.out.println(playerOne.getName() + " guessed the number!");
                break;
            } else if(playerOne.getNumber() > computerNumber) {
                System.out.println("This number is greater than computer number");
            } else {
                System.out.println("This number is less than computer number");
            }
            
            System.out.print(playerTwo.getName() + ": ");
            playerTwo.setNumber(Integer.parseInt(scan.nextLine()));
            if(playerTwo.getNumber() == computerNumber) {
                System.out.println(playerTwo.getName() + " guessed the number!");
                break;
            } else if(playerTwo.getNumber() > computerNumber) {
                System.out.println("This number is greater than computer number");
            } else {
                System.out.println("This number is less than computer number");
            }
        }
    }
}