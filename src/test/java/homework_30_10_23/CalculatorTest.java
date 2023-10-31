package homework_30_10_23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator tests = new Calculator();

    // 1.
    @Test
    void addTest() {
        int a = 2;
        int b = 2;
        int expected = 4;
        Assertions.assertEquals(expected, tests.add(a, b));
    }

    // 2.
    @Test
    void subtractTest() {
        int a = 2;
        int b = 1;
        int expected = 1;
        Assertions.assertEquals(expected, tests.subtract(a, b));
    }

    // 3.
    @Test
    void multiplyTest() {
        int a = 2;
        int b = 3;
        int expected = 6;
        Assertions.assertEquals(expected, tests.multiply(a, b));
    }

    // 4.
    @Test
    void divideTest() {
        int a = 6;
        int b = 2;
        int expected = 3;
        Assertions.assertEquals(expected, tests.divide(a, b));
    }

    @Test
    void divideByZeroTest() {
        int a = 1;
        int b = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> tests.divide(a, b));
    }

    // 5.
    @Test
    void powerTest() {
        int a = 3;
        int b = 2;
        int expected = 3 * 3;
        Assertions.assertEquals(expected, tests.power(a, b));
    }

    // 6.
    @Test
    void factorialTest() {
        int n = 3;
        long expected = 1 * 2 * 3;
        Assertions.assertEquals(expected, tests.factorial(n));
    }

    // 7.
    @Test
    void isEvenTest() {
        int n = 2;
        boolean expected = true;
        Assertions.assertEquals(expected, tests.isEven(n));
    }

    // 8.
    @Test
    void findMaxTest() {
        int[] array = {7, 4, 3, 5};
        int expected = 7;
        Assertions.assertEquals(expected, tests.findMax(array));
    }

    // 9.
    @Test
    void isPrimeLessOwnFalseTest() {
        int n = -1;
        boolean expected = false;
        Assertions.assertEquals(expected, tests.isPrime(n));
    }

    @Test
    void isPrimeMoreOwnFalseTest() {
        int n = 4;
        boolean expected = false;
        Assertions.assertEquals(expected, tests.isPrime(n));
    }

    @Test
    void isPrimeMoreOwnTrueTest2() {
        int n = 5;
        boolean expected = true;
        Assertions.assertEquals(expected, tests.isPrime(n));
    }

    // 10.
    @Test
    void toBaseStringWithoutExceptionTest() {
        int n = 2;
        int base = 2;
        String expected = "10";
        Assertions.assertEquals(expected, tests.toBaseString(n, base));
    }

    @Test
    void toBaseStringWithExceptionTest1() {
        int n = 2;
        int base = 1;
        Assertions.assertThrows(IllegalArgumentException.class, () -> tests.toBaseString(n, base));
    }

    @Test
    void toBaseStringWithExceptionTest2() {
        int n = 2;
        int base = 20;
        Assertions.assertThrows(IllegalArgumentException.class, () -> tests.toBaseString(n, base));
    }

    // 11.
    @Test
    void sqrtTest() {
        double a = 9;
        double expected = Math.sqrt(9);
        //double x = 3 * 3;
        Assertions.assertEquals(expected, tests.sqrt(a));
    }

    @Test
    void sqrtWithExceptionTest() {
        double a = -1;
        Assertions.assertThrows(IllegalArgumentException.class, () -> tests.sqrt(a));
    }

    // 12.
    @Test
    void reverseStringTest() {
        String input = "123";
        String expected = "321";
        Assertions.assertEquals(expected, tests.reverseString(input));
    }

    // 13.
    @Test
    void isPalindromeTrueTest() {
        String input = "1221";
        boolean expected = true;
        Assertions.assertEquals(expected, tests.isPalindrome(input));
    }

    @Test
    void isPalindromeFalseTest() {
        String input = "1222";
        boolean expected = false;
        Assertions.assertEquals(expected, tests.isPalindrome(input));
    }

    // 14.
    @Test
    void gcdTest() {
        int a = 5;
        int b = 10;
        int expected = 5;
        Assertions.assertEquals(expected, tests.gcd(a, b));
    }

    // 15.
    @Test
    void productOfArrayTest() {
        int[] array = {1, 2, 3};
        long expected = 6;
        Assertions.assertEquals(expected, tests.productOfArray(array));
    }

    // 16.
    @Test
    void lengthOfLongestWordTest() {
        String sentence = "12 123 1234";
        String longWord = "1234";
        int expected = longWord.length();
        Assertions.assertEquals(expected, tests.lengthOfLongestWord(sentence));
    }

    // 17.
    @Test
    void celsiusToFahrenheitTest() {
        double celsius = 0;
        double expected = 32;
        Assertions.assertEquals(expected, tests.celsiusToFahrenheit(celsius));
    }

    // 18.
    @Test
    void containsSubstringTrueTest() {
        String maim = "1 2 3 4 5";
        String sub = "2";
        boolean expected = true;
        Assertions.assertEquals(expected, tests.containsSubstring(maim, sub));
    }

    @Test
    void containsSubstringFalseTest() {
        String maim = "1 2 3 4 5";
        String sub = "6";
        boolean expected = false;
        Assertions.assertEquals(expected, tests.containsSubstring(maim, sub));
    }

    // 19.
    @Test
    void sumOfDigitsTest() {
        int number = 111;
        int expected = 3;
        Assertions.assertEquals(expected, tests.sumOfDigits(number));
    }

    // 20.
    @Test
    void isLeapYearTrueTest() {
        int year = 1600;
        boolean expected = true;
        Assertions.assertEquals(expected, tests.isLeapYear(year));
    }

    @Test
    void isLeapYearFalseTest() {
        int year = 1700;
        boolean expected = false;
        Assertions.assertEquals(expected, tests.isLeapYear(year));
    }
}