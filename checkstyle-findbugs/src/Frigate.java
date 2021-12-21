public class Frigate extends Ship {
    private int artillery; //количество артиллерии
    private Boolean pirates;
    private final int defaultArtCount = 33;


    //перегрузка конструктора
    public Frigate(final int masts, final int countCrew, final String flag,
                   final boolean isSink, final String cargo) {
        super(masts, countCrew, flag, isSink, cargo);
        this.artillery = defaultArtCount;
        this.pirates = true;
    }

    //переопределение метода тонуть

    public String sink() {
        this.isSink = true;
        return "Не удивительно, что мы тонем";
    }

    //стрелять
    public void shoot(final boolean weapons) {
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
