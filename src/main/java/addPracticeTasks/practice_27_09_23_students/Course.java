package addPracticeTasks.practice_27_09_23_students;

import java.util.List;
import java.util.Map;

public class Course {
    private int courseId; //  Уникальный идентификатор предмета.
    private String courseName;// Название учебного предмета.
    private String courseDescription;// Описание учебного предмета.
    private int courseCredits;//Количество кредитов, присваиваемых за успешное прохождение предмета.
    private List<Student> studentsEnrolled;// Список студентов, зарегистрированных на данный предмет.
    private List<Student> gradeBook;// Связь студентов и их оценок по данному предмету.


//    public Course(int courseId, String courseName, String courseDescription, int courseCredits, List<String> studentsEnrolled, Map<String, Double> gradeBook) {
//    }

    public Course(int courseId, String courseName, String courseDescription, int courseCredits, List<Student> studentsEnrolled,  List<Student> gradeBook) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseCredits = courseCredits;
        this.studentsEnrolled = studentsEnrolled;
        this.gradeBook = gradeBook;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public List<Student> getStudentsEnrolled(String str) {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(List<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public List<Student> getGradeBook(String str) {
        return gradeBook;
    }

    public void setGradeBook( List<Student> gradeBook) {
        this.gradeBook = gradeBook;
    }
}
