package homework_06_09_23;

public class Student extends Person implements Graded {
    public Grade grade;

    public Student(String name, int age, Grade grade) {
        super(name, age);
        this.grade = grade;
    }

    //GradeManagementSystem gms1 = new GradeManagementSystem();

    @Override
    void getDescription() {
        if (Main.c == 'A' || Main.c == 'B') System.out.println("Студент рекомендован к прохождению стажировки");
        if (Main.c == 'C' || Main.c == 'D') System.out.println("Студенту следует повторно прослушать курс");

    }

//    @Override
//    public Grade getGrade(String name) {
//        return grade;
//    }


    @Override
    public void getGrade(String arg) {
        for (Student stud : GradeManagementSystem.students) {
            if (stud.getName().equals(arg))
                System.out.println("Оценка и имя" + stud.getName() + ":" + stud.grade);
            } return;

            }
        }


