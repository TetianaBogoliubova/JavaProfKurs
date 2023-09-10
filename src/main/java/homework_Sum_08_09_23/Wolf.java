package homework_Sum_08_09_23;

public class Wolf extends WildAninal implements Playable{
    String name;

    public Wolf(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Wo-o-o-o");
    }

    @Override
    public void play(Playable playable) {
        System.out.println("Wolf " + name + " plays with " + playable);
    }
}
