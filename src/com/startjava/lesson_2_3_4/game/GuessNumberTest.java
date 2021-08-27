package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] players = new String[2];
        for(int i = 0; i < 2; i++) {
            System.out.print("Player #" + (i + 1) + " name: ");
            players[i] = scan.nextLine();
        }
        GuessNumber game = new GuessNumber(players);

        String continueAnswer;
        do {
            game.startGame();
            do {
                System.out.print("Do you want to continue? [yes/no]: ");
                continueAnswer = scan.nextLine();
            } while (!(continueAnswer.equals("yes") || continueAnswer.equals("no")));
        } while(continueAnswer.equals("yes"));
    }
}