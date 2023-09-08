package homework_06_09_23;

import java.util.Random;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }
    Grade teacherGrade;
    @Override
    void getDescription() {

    }

    public static char gradeStudent() {//который будет выставлять оценку студенту.
        Random random = new Random();
       return (char) (random.nextInt(4)+'A');

          // В данном ТЗ можно использовать случайное присвоение оценки студенту.
    }

}
