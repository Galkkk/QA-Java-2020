public class Boat extends Ship {
    private int paddles;
    private boolean hopeForSalvation;

    //перегрузка конструктора
    public Boat(final int masts, final int countCrew, final String flag,
                final boolean isSink, final String cargo) {
        super(masts, countCrew, flag, isSink, cargo);
        this.paddles = 1;
        this.hopeForSalvation = true;
    }

    //переопределение метода тонуть
    public String sink() {
        this.isSink = true;
        return "Как мы вообще смогли доплыть!?";
    }

    //стрелять
    public void shoot(final boolean weapons) {
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

