//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final String WELCOME = "\n\nWelcome to the game \"MORTAL KOMBAT AT SEA\"!";
    private static final String ENTER_COMMAND = "\nEnter command: ";
    private static final String EXIT = "[0]: exit the game.";
    private int command;

    public Menu() {
    }

    private void sayHello() {
        System.out.println("\n\nWelcome to the game \"MORTAL KOMBAT AT SEA\"!");
    }

    public void menuGame() throws MyException {
        Scanner scannerIn = new Scanner(System.in);
        FieldBattle fieldBattle = new FieldBattle();
        this.sayHello();
        System.out.println("Place of battle:");
        fieldBattle.printField();
        System.out.println("[0]: exit the game.");
        System.out.println("\nEnter command: ");
        this.command = -300;

        while(this.command != 0) {
            try {
                this.command = scannerIn.nextInt();
            } catch (InputMismatchException var4) {
                throw new MyException("Incorrect input");
            }

            if (this.command == 0) {
                System.out.println("\nQuit the game! Come back for new victories! ;)");
                System.exit(0);
            } else {
                System.out.println("Wrong command! Try again!");
            }
        }

    }
}

