package homework_Sum_29_09_23;

import com.github.javafaker.Faker;

import java.util.Random;

public class MethodsForMonkey {

    Random random = new Random();
    Faker faker = new Faker();

    public String getNameMonkey() {
        String name = faker.name().firstName();
        return name;
    }

    public int getAgeMonkey() {
        int age = random.nextInt(1, 10);
        return age;
    }

    public String getColorMonkey() {
        Monkey monkey = new Monkey();
        ColorOfMonkey[] colors = ColorOfMonkey.values();
        int indexColor = random.nextInt(colors.length);
        monkey.setColour(String.valueOf(colors[indexColor]));
        return monkey.getColour();
    }

    public boolean getInfoAboutHungry() {
        boolean isHungry = random.nextBoolean();
        return isHungry;
    }

    public double getWeightMonkey() {
        double weight = random.nextDouble(1.00, 7.00);
        weight = Math.round(weight * 100.0) / 100.0;
        return weight;
    }
}
