package homework_Sum_08_09_23;

import lombok.Getter;
import lombok.Setter;

public abstract class Animal implements Playable {
    Getter
            Setter;
    private String name;
    private int age;
    private boolean isHungry;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.isHungry = true;
    }

    public void feed() {
        isHungry = false;
        System.out.println(this.getClass().getSimpleName() + " is not hungry anymore");
    }

    public abstract void sayHello();

    @Override
    public void play() {

        System.out.println("Animal " + name + " plays");
    }

    @Override
    public String toString() {

        return "Animal{" + "name='" + name + '\'' + '}';
    }
}
