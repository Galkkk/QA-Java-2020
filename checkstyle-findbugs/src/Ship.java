/**
 * Class Ship.
 *
 * @method boarding.
 * может использоваться как угодно
 */
public abstract class Ship implements IShooter, IFloating {

    /*мачты*/
    private int masts;
    private int countCrew;    /*экипаж*/
    private String flag;      /*флаг страны*/
    boolean isSink;        /*сосстояние судна-тонуть*/
    private String cargo;     /*транспортируемый груз*/


    //конструктор
    public Ship(final int masts1, final int countCrew1, final String flag1,
                final boolean isSink1, final String cargo1) {
        this.masts = masts1;
        this.countCrew = countCrew1;
        this.flag = flag1;
        this.isSink = isSink1;
        this.cargo = cargo1;
    }

    //абстрактный метод, результат - абордаж
    public String boarding() {
        int a = (int) (Math.random() * 3);

        if (1 == a) {
            return "Boarding is succesfull";
        }
        return "Boarding failed";
    }

    //перевозка груза
    void transportingCargo(final String cargo1) {
        System.out.print("Перевозится груз:" + cargo1);
    }


    public String sink() {
        this.isSink = true;
        return "Корабль тонет";
    }
}
