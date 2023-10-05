package addPracticeTasks.practice_27_09_23_students;

import com.github.javafaker.Faker;

import java.util.*;

public class MethodsForStudents {

    // Student student = new Student(ms.getIdStudent(), ms.getFirstName(), ms.getLastName(), ms.getAgeStudent(), ms.setUpGradesList(), ms.getCoursesByStudent());
    Random random = new Random();
    Faker faker = new Faker();
    //DataProcessor dataProcessor = new DataProcessor();
    // private DataProcessor dataProcessor;
private DataProcessor dataProcessor;
    private double grade;
    List<Double> grades = new ArrayList<>();
     List<Student> gradeBook = new ArrayList<>();
    List<String> coursesByStudent = new ArrayList<>();
    List<Student> studentsEnrolled = new ArrayList<>();

    public DataProcessor getDataProcessor() {
        return dataProcessor;
    }

    public void setDataProcessor(DataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
//    public MethodsForStudents() {
//        grades = random.nextDouble(1, 10);
//    }

//    public MethodsForStudents() {
//        grades = random.nextDouble(1, 10);
//    }

//    public MethodsForStudents(DataProcessor dataProcessor) {
//        this.dataProcessor = new DataProcessor();
//        this.dataProcessor = dataProcessor;
//        faker = new Faker();
//    }

//    public MethodsForStudents() {
//        dataProcessor = new DataProcessor();
//        faker = new Faker();
//    }


    public int getIdStudent() {
        int id = random.nextInt(10, 100);
        return id;
    }

    public String getFirstName() {
        String firstName = faker.name().firstName();
        return firstName;
    }

    public String getLastName() {
        String lastName = faker.name().lastName();
        return lastName;
    }

    public int getAgeStudent() {
        int age = random.nextInt(18, 24);
        return age;
    }

    public double getGradeStudent() {
        grade = random.nextInt(1, 10);
        grade = Math.round(grade * 100.0) / 100.0;
        return grade;
    }

    public List<Double> setUpGradesStudentList() {
        //grades = Math.round(grades * 100.0) / 100.0;
        while (grades.size() < 15) {
            grades.add(grade);
        }
        return grades;
    }


    public int getCourseId() {
        int courseId = random.nextInt(10, 50);
        return courseId;
    }

    public String getCourseName() {
        String courseName = faker.educator().course();
        return courseName;
    }

    public String getCourseDescription() {
        String courseDescription = faker.job().title();
        return courseDescription;
    }

    public int getCourseCredits() {
        int courseCredits = random.nextInt(1, 6);
        return courseCredits;
    }

    public List<Student> getStudentsEnrolled(String str) {
        for (Student i : dataProcessor.c) {
            if (i.getCoursesByStudent().equals(str)) {
                studentsEnrolled.add();
            }
        }
        return studentsEnrolled;
    }

    public List<Student> getGradeBook(String arg) {
        for (Student i : dataProcessor.students) {
            if (i.getCoursesByStudent().equals(arg)) {
                gradeBook.add(i.getLastName())
                gradeBook.add((Student) i.getGrades());
            }
        }
        return gradeBook;
    }

    public Course getCoursesByStudent() {
        if (dataProcessor != null) {
            return dataProcessor.courses.get(random.nextInt(dataProcessor.courses.size()));
        }
        return null;
    }
}
