package ClassWork2;

public class Duck extends Animal implements Flyable, Runable, Speakable, Swimable{

    public Duck(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String fly() {
        return "90 km/h";
    }

    @Override
    public String run() {
        return "15 km/h";
    }

    @Override
    public String speak() {
        return "krya";
    }

    @Override
    public String swim() {
        return "10 km/h";
    }
}
