public class Main {
    private Main() {
        //not used
    }

    public static void main(String[] args) {
        Helper helper = new Helper();


        Battleship battleship = new Battleship(0, 10000, "China", false,
                "tanks", "SuperMegaKiller 3000", true);

        System.out.println("Линкор:");
        battleship.shoot(true);
        helper.print(battleship.boarding());
        battleship.sail();
        helper.print(battleship.sink());

        System.out.println();

        Frigate frigate = new Frigate(3, 100, "USA", false, "Barrels");
        System.out.println("Фрегат:");
        frigate.shoot(false);
        helper.print(frigate.boarding());
        frigate.sail();
        helper.print(frigate.sink());

        System.out.println();

        Boat boat = new Boat(1, 1, "Spain", true, "nothing");
        System.out.println("Шлюпка:");
        boat.shoot(false);
        helper.print(boat.boarding());
        boat.sail();
        helper.print(boat.sink());
    }
}
