package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player[] players = new Player[2];
    private int computerNumber;

    public GuessNumber(String[] players) {
        for(int i = 0; i < players.length; i++) {
            this.players[i] = new Player(players[i]);
        }
    }

    public void startGame() {
        System.out.println("Start!");
        setGame();
        boolean isGuessed = false;
        while(players[players.length - 1].getLastNumberIndex() != 9) {
            for (Player player : players) {
                makeAttempt(player);
                if (compare(player)) {
                    isGuessed = true;
                    break;
                }
            }
            if(isGuessed) {
                break;
            }
        }
        showAttmepts();
    }

    private void setGame() {
        for(Player player : players) {
            player.resetAttempts();
        }
        Random random = new Random();
        computerNumber = 1 + random.nextInt(100);
        System.out.println("/*Test: computerNumber = " + computerNumber + "*/");
    }

    private void makeAttempt(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + ": ");
        player.setNumber(Integer.parseInt(scan.nextLine()));

    }

    private boolean compare(Player player) {
        if(player.getNumber() == computerNumber) {
            System.out.println(player.getName() + " guessed the number on the attempt #" + player.getLastNumberIndex() + "!");
            return true;
        } else if(player.getNumber() > computerNumber) {
            System.out.println("This number is greater than computer number");
            return false;
        } else {
            System.out.println("This number is less than computer number");
            return false;
        }
    }

    private void showAttmepts() {
        for (Player player : players) {
            System.out.print(player.getName() + " attempts: ");
            for (int attempt : player.getNumbers()) {
                System.out.print(attempt + " ");
            }
            System.out.println();
        }
    }
}