//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

public class FieldBattle {
    private String[][] field;
    private int sizeField = 10;
    private String[] letter = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    public FieldBattle() {
        this.field = new String[this.sizeField][this.sizeField];
        this.setWawe();
    }

    private void setWawe() {
        this.field[0][0] = " ";

        for(int x = 0; x < this.sizeField; ++x) {
            for(int y = 0; y < this.sizeField; ++y) {
                this.field[x][y] = "~";
            }
        }

    }

    public void printField() {
        System.out.print("  ");

        int x;
        for(x = 0; x < this.sizeField; ++x) {
            System.out.print(x + 1 + " ");
        }

        System.out.println("");

        for(x = 0; x < this.sizeField; ++x) {
            System.out.print(this.letter[x] + " ");

            for(int y = 0; y < this.sizeField; ++y) {
                System.out.print(this.field[x][y] + " ");
            }

            System.out.println("");
        }

    }
}
