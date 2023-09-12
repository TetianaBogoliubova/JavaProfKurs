package homework_Sum_08_09_23;

public class Park {
    public static void main(String[] args) {

        Animal animal = new Cat("Tom", 1);
        animal.feed();
        animal = new Dog("Mikky", 2, "grey");
        animal.feed();
        animal.sayHello();

//        ((Dog) animal).bark(); // possible, but not save
        Dog mikky = new Dog("Mikky", 2, "grey");
        mikky.bark();

        Human human = new Human("Harry");
        Cat cat = new Cat("MyCat", 2);
        Dog dog = new Dog("MyDog", 2, "grey");
        Robot robot = new Robot();
        Lion lion = new Lion("'Wild lion'");
        Wolf wolf = new Wolf("'Wild wolf'");

//        human.play();
//        cat.play();
//        dog.play();
        human.play(cat);
        System.out.println();
        System.out.println("Домашнее задание от 08.09.23: дописанные или измененные методы: ");
        human.walk(dog);
        robot.walk(cat);
        lion.feed();
        wolf.feed();
        lion.play();
        wolf.play();
        lion.play(cat);
        wolf.play(dog);
        cat.play(dog);
        dog.play(cat);
        System.out.println("*************");

        Playable[] arrayOfGamers = {human, cat, dog, robot};
        allPlay(arrayOfGamers);

        //allPlayWithVarArg(human, cat, dog, robot);
    }

    public static void allPlay(Playable[] playables) {
        for (Playable p : playables) {
            p.play();
        }
    }

    public static void allPlayWithVarArg(Playable... playables) {
        for (Playable p : playables) {
            p.play();
        }
    }
}
