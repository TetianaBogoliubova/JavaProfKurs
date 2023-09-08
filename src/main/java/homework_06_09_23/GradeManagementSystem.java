package homework_06_09_23;

import java.util.Arrays;

public class GradeManagementSystem {

    static Student[] students = {
            new Student("Ливанов", 20, Grade.A),
            new Student("Петров", 23, Grade.B),
            new Student("Сидоров", 24, Grade.C),
            new Student("Пяточкин", 19, Grade.D),
            new Student("Пупкин", 22, Grade.B)
    };


    public void processStudents(String name1) {
        for (Person stud : students) {
            if (stud.getName().equals(stud)) {
                System.out.println(stud.getName() + ":" + stud.getName());
            }
        }
    } //- метод для вывода информации о студентах (перебор массива студентов).


    Teacher teacher1 = new Teacher("Учитель 1", 40);
    Teacher teacher2 = new Teacher("Учитель 2", 45);
    Teacher teacher3 = new Teacher("Учитель 3", 50);
    Teacher[] teachers = {teacher1, teacher2, teacher3};

    @Override
    public String toString() {
        return "GradeManagementSystem{" +
                "teacher1=" + teacher1 +
                ", teacher2=" + teacher2 +
                ", teacher3=" + teacher3 +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }


    public void processTeachers() {
    } //- метод для вывода информации о преподавателях (перебор массива преподавателей).

    public void gradeStudents() {
    }//- метод для автоматической выставления оценок студентам преподавателями
    // (используя метод gradeStudent() из класса Teacher).

}
