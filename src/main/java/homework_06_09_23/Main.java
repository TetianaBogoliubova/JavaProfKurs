package homework_06_09_23;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static char c;


    public static void main(String[] args) {
        GradeManagementSystem gms = new GradeManagementSystem();
        Student student = new Student("Ливанов", 20, Grade.A);
        System.out.println("Введите имя студента из списка: " + Arrays.toString(gms.students));
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();

        c = Teacher.gradeStudent();
        System.out.println("Средняя оценка студента " + inputName + " - " + c);

        student.getDescription();
        student.getGrade("Петров");
        gms.processStudents("Сидоров");


//char c = Teacher.gradeStudent();
        //System.out.println(Teacher.gradeStudent());
//        System.out.println();
//        System.out.println(Arrays.toString(gms.teachers));

    }
}
