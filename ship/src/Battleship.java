public class Battleship extends Ship {
    String nuclearGun;
    boolean engine;

    //перегрузка конструктора
    public Battleship(int masts, int countCrew, String flag, boolean isSink, String cargo, String nuclearGun,
            boolean engine) {
        super(masts, countCrew, flag, isSink, cargo);
        this.nuclearGun =nuclearGun;
        this.engine=engine;
    }


    //переопределение метода тонуть
    public  String sink() {
        this.isSink = true;
        return "Джек, мы тонем";
    }

    //стрелять
    public void shoot(boolean weapons) {
        if (weapons) {
            System.out.println("Тыдыщ");
        } else {
            System.out.println("Не стреляет");
        }
    }

    //плыть
    public void sail(){
        System.out.println("Угрожающе быстро плывет");
    }

}
