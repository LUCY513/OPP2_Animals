package ClassWork2;

public class Fish extends Animal implements Swimable, Speakable{

    public Fish(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String speak() {
        return "Bul bul";
    }

    @Override
    public String swim() {
        return "80 km/h";
    }

}
