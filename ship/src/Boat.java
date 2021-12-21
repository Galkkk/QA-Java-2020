public class Boat extends Ship {
    int paddles;
    boolean hopeForSalvation;

    //перегрузка конструктора
    public Boat(int masts, int countCrew, String flag, boolean isSink, String cargo) {
        super(masts, countCrew, flag, isSink, cargo);
        this.paddles = 1;
        this.hopeForSalvation = true;
    }

    //переопределение метода тонуть
    public String sink() {
        this.isSink = true;
        return "Как мы вообще до сюда смогли доплыть!?";
    }

    //стрелять
    public void shoot(boolean weapons) {
        if (weapons) {
            System.out.println("Пиу");
        } else {
            System.out.println("Не стреляет");
        }
    }

    //плыть
    public void sail() {
        if (hopeForSalvation) {
            System.out.println("Спасибо, что плывет");
        }
    }

}

