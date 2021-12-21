/**
 * Main class.
 *
 * @version 1
 */
final class Main {
    private Main() {
        //not used
    }

    /**
     * Main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        final int count1 = 1000;
        final int count2 = 100;
        final int count3 = 1;

        Helper helper = new Helper();

        Battleship battleship = new Battleship(0, count1, "China",
                false, "tanks", "SuperMegaKiller 3000", true);

        System.out.println("Линкор:");
        battleship.shoot(true);
        helper.print(battleship.boarding());
        battleship.sail();
        helper.print(battleship.sink());

        System.out.println();

        Frigate frigate = new Frigate(1, count2, "USA",
                false, "Barrels");
        System.out.println("Фрегат:");
        frigate.shoot(false);
        helper.print(frigate.boarding());
        frigate.sail();
        helper.print(frigate.sink());

        System.out.println();

        Boat boat = new Boat(1, count3, "Spain", true, "nothing");
        System.out.println("Шлюпка:");
        boat.shoot(false);
        helper.print(boat.boarding());
        boat.sail();
        helper.print(boat.sink());
    }
}
