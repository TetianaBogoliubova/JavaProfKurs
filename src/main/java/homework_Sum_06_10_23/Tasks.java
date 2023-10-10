package homework_Sum_06_10_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Tasks {

    // 1. Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного
    // исходного списка анекдотов.

    public void getRandomJoke() {
        List<String> jokeList = new ArrayList<>();
        jokeList.add("Как при такой манере фехтования Йода умудряется не отрезать себе уши?");
        jokeList.add("Чтобы уйти от бабушки, колобок был готов разбиться в лепешку...");
        jokeList.add("В принципе, погода хорошая. Если из дома не выходить");
        jokeList.add("Слащавые книги ведут к литературному диабету");

        Supplier<String> randomJoke = () -> {
            Random random = new Random();
            int index = random.nextInt(jokeList.size());
            return jokeList.get(index);
        };
        System.out.println(randomJoke.get());
    }

    // 2. Создать Consumer, который принимает числа и печатает четные числа в поток System.out, а нечетные числа в System.err.
    public void getDifferentNumbers() {
        List<Integer> numbers = Arrays.asList(32, 1, 6, 5, 4, 12, 19, 94, 9, 87);

        Consumer<Integer> printNumbers = (num) -> {
            if (num % 2 == 0) {
                System.out.println(num);
            } else {
                System.err.println(num);
            }
        };
        for (Integer i : numbers) {
            printNumbers.accept(i);
        }
    }

    // 3. Создать Predicate isYellowMonkey, который проверяет, желтого ли цвета обезьянка Monkey.

    public void getPredicateIsYellowMonkey() {

        Predicate<String> isYellowMonkey = (s) -> s.equals("yellow");
        System.out.println(isYellowMonkey.test("yellow"));
        System.out.println(isYellowMonkey.test("another"));
    }

    // 4*. Создать с помощью методов Function .compose() и .andThen() функцию convertToCelsius, которая заменяет исходное
    // число типа Integer на его строковое представление, добавляя в строковом представлении перед числом его знак (+ или -)
    //добавляет после числа текст "degrees Celsius"
    //ограничивает значения числа значениями +/- 100, выдавая граничные значения при превышении диапазона
    //convertToCelsius.apply(-150) вернет "-100 degrees Celsius"
    //convertToCelsius.apply(150) вернет "+100 degrees Celsius"

    public void getConvertToCelsius(int x) {
        Function<Integer, Integer> limitForDegrees = lim -> Math.min(Math.max(lim, -100), 100);
        Function<String, String> convertToString = (i) -> String.valueOf(i);
        Function<Integer, String> addMinusAndPlus = num -> {
            if (num >= 0) {
                return "+" + num;
            } else {
                return "-" + Math.abs(num);
            }
        };
        Function<String, String> setDegreesCelsius = (val) -> val + " degrees Celsius";

        Function<Integer, String> convertToCelsius = addMinusAndPlus.compose(limitForDegrees).andThen(convertToString).andThen(setDegreesCelsius);
        String result = convertToCelsius.apply(x);
        System.out.println(result);
    }
}





