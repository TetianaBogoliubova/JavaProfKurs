package homework_Sum_08_09_23;

import lombok.Getter;
import lombok.Setter;

public class Dog extends Pet {
    Getter
            Setter;
    private String color;

    // Cat cat = new Cat("name", 0);
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

        if (playable instanceof Cat) {
            System.out.println("Dog barks auf cat");
        } else System.out.println("Dog play with " + playable);
    }
}