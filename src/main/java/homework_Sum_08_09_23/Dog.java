package homework_Sum_08_09_23;

import lombok.Getter;
import lombok.Setter;

public class Dog extends Pet {
    Getter
            Setter;
    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void bark() {
        System.out.println("Gav-gav!!!");
    }

    @Override
    public void sayHello() {

        System.out.println("Gav-gav!");
    }

    @Override
    public void play(Playable playable) {
Cat cat = new Cat("name", 0);
        //System.out.println("Dog plays with " + playable);
        if (playable == cat.dog) {
            System.out.println("dog gav auf cat");
        } else System.out.println(",,,,");
    }
}