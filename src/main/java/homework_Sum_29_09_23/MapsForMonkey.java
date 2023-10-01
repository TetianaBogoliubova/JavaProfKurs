package homework_Sum_29_09_23;

import java.util.*;

public class MapsForMonkey {

    MethodsForMonkey methodsForMonkey = new MethodsForMonkey();
    List<Monkey> monkeys = new ArrayList<>();

    public List<Monkey> setMankeyInList() {
        while (monkeys.size() < 20) {
            Monkey monkey = new Monkey(
                    methodsForMonkey.getNameMonkey(),
                    methodsForMonkey.getAgeMonkey(),
                    methodsForMonkey.getColorMonkey(),
                    methodsForMonkey.getInfoAboutHungry(),
                    methodsForMonkey.getWeightMonkey()
            );
            monkeys.add(monkey);
        }
        return monkeys;
    }

    //Получить Map имя / информация, голодна ли обезьянка
    public Map<String, Boolean> getNameAndIsHungry(List<Monkey> monkeys) {
        Map<String, Boolean> nameAndIsHungry = new HashMap<>();
        for (Monkey i : monkeys) {
            String key = i.getName();
            Boolean val = i.isHungry();
            nameAndIsHungry.put(key, val);
        }
        return nameAndIsHungry;
    }

    //Получить Map цвет / количество обезьян данного цвета
    public Map<ColorOfMonkey, Integer> getColorAndCount(List<Monkey> monkeys) {
        Map<ColorOfMonkey, Integer> colorAndCount = new HashMap<>();
        for (Monkey i : monkeys) {
            ColorOfMonkey key = ColorOfMonkey.valueOf(i.getColour());
            Integer count = colorAndCount.get(key);
            colorAndCount.put(key, colorAndCount.getOrDefault(key, 0) + 1);
        }
        return colorAndCount;
    }

    //Получить Map> цвет / список имен обезьян данного цвета
    public Map<String, ColorOfMonkey> getColorAndName(List<Monkey> monkeys, ColorOfMonkey color) {
        Map<String, ColorOfMonkey> colorAndName = new HashMap<>();
        for (Monkey i : monkeys) {
            String key = i.getName();
            ColorOfMonkey val = ColorOfMonkey.valueOf(i.getColour());
            if (val.equals(color)) {
                colorAndName.put(key, val);
            }
        }
        return colorAndName;
    }
//Создать компаратор и отсортировать исходный список по весу и имени

    public void sortListByWeightAndNameComparator() {

        Comparator<Monkey> comparatorByWeight = new Comparator<Monkey>() {
            @Override
            public int compare(Monkey o1, Monkey o2) {
                return (int) ((int) o1.getWeight() - o2.getWeight());
            }
        };
        Collections.sort(monkeys, comparatorByWeight);
        for (Monkey i : monkeys) {
            System.out.println("Sort monkeys by weight: " + i);
        }


        Comparator<Monkey> comparatorByName = new Comparator<Monkey>() {
            @Override
            public int compare(Monkey o1, Monkey o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(monkeys, comparatorByName);
        for (Monkey i : monkeys) {
            System.out.println("Sort monkeys by name: " + i);
        }
    }
}
