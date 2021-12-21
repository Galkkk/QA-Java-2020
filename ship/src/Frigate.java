public class Frigate extends Ship {
    int artillery; //количество артиллерии
    Boolean pirates;


    //перегрузка конструктора
    public Frigate(int masts, int countCrew, String flag, boolean isSink, String cargo) {
        super(masts, countCrew, flag, isSink, cargo);
        this.artillery = 33;
        this.pirates = true;
    }

    //переопределение метода тонуть

    public String sink() {
        this.isSink = true;
        return "Не удивительно, что мы тонем";
    }

    //стрелять
    public void shoot(boolean weapons) {
        if (weapons) {
            System.out.println("Пиу-пиу-пиу");
        } else {
            System.out.println("Не стреляет");
        }
    }

    //плыть
    public void sail() {
        System.out.println("Плывет");
    }
}
