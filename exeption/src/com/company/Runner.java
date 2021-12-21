//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

public class Runner {
    public Runner() {
    }

    public static void main(String[] args) throws MyException {
        Menu menu = new Menu();
        Logo.printLogo();

        try {
            menu.menuGame();
        } catch (MyException var3) {
        }

    }
}
