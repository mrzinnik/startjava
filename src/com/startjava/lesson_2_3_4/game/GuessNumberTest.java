package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Player #1 name: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Player #2 name: ");
        Player playerTwo = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);

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