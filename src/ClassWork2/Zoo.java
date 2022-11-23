package ClassWork2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Zoo {
    private List<Animal> animals;

    public Zoo(){
        animals = new ArrayList<>(Arrays.asList(
                new Cat("Барсик", "Sfinx", "Black", 4, 5),
                new Dog("Vulcan", "Dvornyaga", "BlackAndWhite", 4, 7),
                new Fish("Dori", "Blue Sergeon", "Blue", 0, 20),
                new Duck("Puk", "King", "Gold and black", 2, 5),
                new Octopus ("Gats", "Blue Ring octopus", "Blue", 8, 10)
        ));
    }

    public void talk(){
        for (Speakable item : getSpeakable()) {
            System.out.printf("%s\n", item.speak());
        }
    }

    public List<Speakable> getSpeakable(){
        List<Speakable> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if(speakItem instanceof Speakable){
                result.add((Speakable) speakItem);
            }
        }
        result.add(new Rdio());
        return result;
    }

    public List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();
        for (Animal runItem : animals) {
            if(runItem instanceof Runable){
                result.add((Runable) runItem);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal flyItem : animals) {
            if(flyItem instanceof Flyable){
                result.add((Flyable) flyItem);
            }
        }
        return result;
    }

    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal swimItem : animals) {
            if(swimItem instanceof Swimable){
                result.add((Swimable) swimItem);
            }
        }
        return result;
    }



    public void run() {
        for (Runable item : getRunable()) {
            System.out.printf("%s %s\n", item.toString(), item.run());
        }
    }
    public void fly() {
        for (Flyable item : getFlyable()) {
            System.out.printf("%s %s\n", item.toString(), item.fly());
        }
    }

    public void swim(){
        for(Swimable item : getSwimable()){
            System.out.printf("%s %s\n", item.toString(), item.swim());
        }
    }

}
