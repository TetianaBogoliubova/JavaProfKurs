package homework_Sum_08_09_23;

public class Cat extends Pet {
    //    private Kitten kitten = new Kitten();

    private static int catCount = 0;
    //Dog dog = new Dog("name", 0, "black");
    Robot robot = new Robot();
    Human human = new Human("name");

    public static void printCatCount() {
        // age++; impossible
        System.out.println("Total cat count: " + catCount);
    }

    public Cat(String catName, int catAge) {
        super(catName, catAge);
        catCount++;
    }

    public Kitten createKitten() {
        Kitten kitten = new Kitten();
        kitten.kittenName = "New name";
        return kitten;
    }

    @Override
    public void sayHello() {
        System.out.println("Meow!");
    }

    @Override
    public void play(Playable playable) {

        if (playable instanceof Dog) {
            System.out.println("Cat running away from dog!");

        } else System.out.println("Cat play with " + playable);
    }

    public class Kitten extends Animal {
        private String kittenName;

        public String getParentName() {
            return super.getName();
        }

        @Override
        public void sayHello() {
            System.out.println("Meow!");
        }

        @Override
        public void play(Playable playable) {
            System.out.println("Kitten plays with " + playable);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}