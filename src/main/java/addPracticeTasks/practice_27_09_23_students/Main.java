package addPracticeTasks.practice_27_09_23_students;
//### 1. Описание проекта
//
//        Цель проекта состоит в том, чтобы создать программу,
//        которая моделирует управление данными о студентах,
//        их оценках и учебных предметах. Проект будет включать в себя минимум
//        3 класса с шестью полями в каждом, а также класс для обработки структур
//        данных с шестью методами, использующими циклы.
//
//        ### 2. Классы
//
//        #### 2.1. Класс "Student"
//
//        Поля:
//        - `id` : Уникальный идентификатор студента.
//        - `firstName` : мя студента.
//        - `lastName` : Фамилия студента.
//        - `age` : Возраст студента.
//        - `grades` : Список оценок студента.
//        - `courses` : Множество учебных предметов, которые посещает студент.
//
//        #### 2.2. Класс "Course"
//
//        Поля:
//        - `courseId`  Уникальный идентификатор предмета.
//        - `courseName` : Название учебного предмета.
//        - `courseDescription` : Описание учебного предмета.
//        - `courseCredits` : Количество кредитов, присваиваемых за успешное прохождение предмета.
//        - `studentsEnrolled` : Список студентов, зарегистрированных на данный предмет.
//        - `gradeBook` : Связь студентов и их оценок по данному предмету.
//
//        #### 2.3. Класс "DataProcessor"
//
//        Поля:
//        - `students` (List<Student>): Список всех зарегистрированных студентов.
//        - `courses` (Set<Course>): Множество всех доступных учебных предметов.
//
//        Методы:
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
//
//        ### 3. Обработка данных
//
//        Студенты будут добавляться, оценки будут записываться и учебные предметы
//        будут создаваться и управляться с использованием методов класса
//        "DataProcessor". Данные о студентах и предметах будут храниться
//        в соответствующих объектах классов "Student" и "Course".
public class Main {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor();
        System.out.println(dataProcessor.setUpStudents());
        System.out.println(dataProcessor.setUpCourses().toString());
    }
}
