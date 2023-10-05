package addPracticeTasks.practice_27_09_23_students;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataProcessor {
    MethodsForStudents ms = new MethodsForStudents();
    Course course;
    Student student;

    List<Student> students = new ArrayList<>();// Список всех зарегистрированных студентов.
    Set<Course> courses = new HashSet<Course>();// (): Множество всех доступных учебных предметов.
    List<Student> gradesList = new ArrayList<>();
    List<Course> coursesForStudent = new ArrayList<>();

    public DataProcessor() {
        course = new Course(ms.getCourseId(), ms.getCourseName(), ms.getCourseDescription(), ms.getCourseCredits(), ms.getStudentsEnrolled(""), ms.getGradeBook(""));
        student = new Student(ms.getIdStudent(), ms.getFirstName(), ms.getLastName(), ms.getAgeStudent(), ms.setUpGradesStudentList(), (List<String>) ms.getCoursesByStudent());
    }

    public Set<Course> setUpCourses() {
        while (courses.size() < 15) {
            Course course = new Course(
                    ms.getCourseId(),
                    ms.getCourseName(),
                    ms.getCourseDescription(),
                    ms.getCourseCredits(),
                    ms.getStudentsEnrolled(""),
                    ms.getGradeBook("")
            );
courses.add(course);
        }
        return courses;
    }

    public List<Student> setUpStudents() {
        while (students.size() < 40) {
            Student student = new Student(
                    ms.getIdStudent(),
                    ms.getFirstName(),
                    ms.getLastName(),
                    ms.getAgeStudent(),
                    ms.setUpGradesStudentList(),
                    ms.getCoursesByStudent()
            );
            students.add(student);
        }
        return students;
    }

    public List<Course> setCoursesByStudent() {
        while (coursesForStudent.size() < 9) {
            Student course1 = ms.getCoursesByStudent();
            coursesForStudent.add(course);
        }
        return coursesForStudent;
    }


    //Методы:
//        1. `public double calculateAverageGrade(Student student)`: Метод, который
//        вычисляет средний балл для конкретного студента.
//        2. `public Map<Student, Double> calculateClassAverage()`: Метод, который вычисляет
//        средний балл для каждого студента и возвращает результат в виде отображения (Map).
//        3. `public List<String> listCourseNamesWithLowestAverage()`: Метод, который
//        возвращает список названий предметов с наименьшим средним баллом среди студентов.
//        4. `public void addStudentToCourse(Student student, Course course)`: Метод,
//        который добавляет студента на учебный предмет.
//        5. `public void recordGrade(Student student, Course course, double grade)`: Метод,
//        который записывает оценку студенту по учебному предмету.
//        6. `public void removeStudentFromCourse(Student student, Course course)`: Метод,
//        который удаляет студента с учебного предмета.
}
