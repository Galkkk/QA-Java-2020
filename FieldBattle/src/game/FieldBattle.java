package game;

/**
 * Игровое поле.
 */
public class FieldBattle {
    private String[][] field;
    private int sizeField = 10;
    private String[] letter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    public FieldBattle() {
        field = new String[sizeField][sizeField];
        setWawe();
    }

    /**
     * Заполнение поля 'волнами'.
     */
    private void setWawe() {
        field[0][0] = " ";
        for (int x = 0; x < sizeField; x++) {
            for (int y = 0; y < sizeField; y++) {
                field[x][y] = "~";
            }
        }
    }

    /**
     * Вывод поля в консоль.
     */
    public void printField() {
        System.out.print("  ");
        for (int i = 0; i < sizeField; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println("");
        for (int x = 0; x < sizeField; x++) {
            System.out.print(letter[x] + " ");
            for (int y = 0; y < sizeField; y++) {
                System.out.print(field[x][y] + " ");
            }
            System.out.println("");
        }
    }
}
