public class Runner {
    public static void main(String[] args) {
        Box box = new Box();

        box.putInABox("котяток");

        System.out.println("Что же у нас в коробке?");
        System.out.println("А в коробочке нашли " + box.showInsideTheBox());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        box.clearBox();
        System.out.println("А в коробочке нашли " + box.showInsideTheBox());
    }
}

