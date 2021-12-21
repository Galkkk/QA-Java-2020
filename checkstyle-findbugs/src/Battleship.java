public class Battleship extends Ship {
    private String nuclearGun;
    private boolean engine;

    //перегрузка конструктора
    public Battleship(final int masts, final int countCrew, final String flag,
                      final boolean isSink, final String cargo,
                      final String nuclearGun1, final boolean engine1) {
        super(masts, countCrew, flag, isSink, cargo);
        this.nuclearGun = nuclearGun1;
        this.engine = engine1;
    }


    //переопределение метода тонуть
    public String sink() {
        this.isSink = true;
        return "Джек, мы тонем";
    }

    //стрелять
    public void shoot(final boolean weapons) {
        if (weapons) {
            System.out.println("Тыдыщ");
        } else {
            System.out.println("Не стреляет");
        }
    }

    //плыть
    public void sail() {
        System.out.println("Угрожающе быстро плывет");
    }

}
