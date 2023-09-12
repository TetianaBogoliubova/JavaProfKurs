package homework_Sum_08_09_23;

public class Lion extends WildAninal implements Playable {
    String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Rrrway");
    }

    @Override
    public void play(Playable playable) {
        System.out.println("Lion " + name + " plays with " + playable);
    }
}
