package homework_Sum_08_09_23;

public class Human implements Playable, Walkable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Human " + name + " plays");
    }

    @Override
    public void play(Playable playable) {
        System.out.println("Human " + name + " plays with " + playable);
    }


    @Override
    public void walk(Pet pet) {
        System.out.println("Human " + name + " walks with " + pet);
    }
}

