import ClassWork2.*;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.talk();

        System.out.println();
        System.out.println("Run\n=============== ");
        zoo.run();

        System.out.println();
        System.out.println("Fly\n=============== ");
        zoo.fly();

        System.out.println();
        System.out.println("Swim\n=============== ");
        zoo.swim();
    }
}