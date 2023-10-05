package addPracticeTasks.practice_27_09_23_students;

import java.util.List;

public class Student {

    private int id; // Уникальный идентификатор студента.
    private String firstName;// мя студента.
    private String lastName;// Фамилия студента.
    private int age; //Возраст студента.
    private List<Double> grades; //Список оценок студента.
    private List<Course> coursesByStudent;// Множество учебных предметов, которые посещает студент.


//    public Student(int idStudent, String firstName, String lastName, int ageStudent, List<Double> doubles, Course coursesByStudent) {
//    }


    public Student(int id, String firstName, String lastName, int age, List<Double> grades, List<Course> coursesByStudent) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grades = grades;
        this.coursesByStudent = coursesByStudent;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

//    public List<Course> getCoursesByStudent() {
//        return coursesByStudent;
//    }
//
//    public void setCourses(List<String> courses) {
//        this.coursesByStudent = courses;
//    }

    public List<Course> getCoursesByStudent() {
        return coursesByStudent;
    }

    public void setCoursesByStudent(List<Course> coursesByStudent) {
        this.coursesByStudent = coursesByStudent;
    }
}
