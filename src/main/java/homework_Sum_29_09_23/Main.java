package homework_Sum_29_09_23;

public class Main {
    public static void main(String[] args) {
        MapsForMonkey mapsForMonkey = new MapsForMonkey();

        System.out.println("General list of monkeys: " + mapsForMonkey.setMankeyInList());
        System.out.println("Name of the monkey that are fed or hungry: " + mapsForMonkey.getNameAndIsHungry(mapsForMonkey.monkeys));
        System.out.println("Count of monkeys by color: " + mapsForMonkey.getColorAndCount(mapsForMonkey.monkeys));
        System.out.println("Color of monkeys and their name: " + mapsForMonkey.getColorAndName(mapsForMonkey.monkeys, ColorOfMonkey.BEIGE));
        mapsForMonkey.sortListByWeightAndNameComparator();
    }
}
