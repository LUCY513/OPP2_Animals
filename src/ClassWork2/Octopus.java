package ClassWork2;

public class Octopus extends Animal implements Swimable,Speakable{
    public Octopus(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String speak() {
        return "dead";
    }

    @Override
    public String swim() {
        return "40 km/h";
    }
}
