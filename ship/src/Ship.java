public abstract class Ship implements IShooter, IFloating {
    int masts;        /*мачты*/
    int countCrew;    /*экипаж*/
    String flag;      /*флаг страны, под которым плавает судно*/
    boolean isSink;   /*сосстояние судна-тонуть*/
    String cargo;     /*транспортируемый груз*/


    //конструктор
    public Ship(int masts, int countCrew, String flag, boolean isSink, String cargo) {
        this.masts = masts;
        this.countCrew = countCrew;
        this.flag = flag;
        this.isSink = isSink;
        this.cargo = cargo;
    }

    //абстрактный метод, возвращающий результат - абордаж
    public String boarding() {
        int a = (int) (Math.random() * 3);

        if (1 == a) {
            return "Boarding is succesfull";
        }
        return "Boarding failed";
    }

    //перевозка груза
    void transportingCargo(String cargo) {
        System.out.print("Перевозится груз:" + cargo);
    }

    //тонуть:)
    public String sink() {
        this.isSink = true;
        return "Корабль тонет";
    }


}

/*в дочерних классах по 2 метода и 2 поля
 * перегрузка методов
 * переопределение
 *
 * реализация в майн
*
 * модификаторы доступа
 * final где надо
 * */