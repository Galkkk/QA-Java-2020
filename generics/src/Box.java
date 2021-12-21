public class Box<T> {

    T something;
    boolean availability;

    public void check() {
        availability = something != null;
    }

    public void putInABox(T something1) {
        check();
        if (!availability) {
            this.something = something1;
        }
    }


    public T showInsideTheBox() {
        check();
        if (availability) {
            return this.something;
        }
        return null;
    }

    public void clearBox() {
        check();
        if (availability) {

            System.out.println("Мы выкинули из коробки " + something);
            something = null;
        } else {
            System.out.println("Коробка и без очистки пустая :( ");
        }
    }
}


