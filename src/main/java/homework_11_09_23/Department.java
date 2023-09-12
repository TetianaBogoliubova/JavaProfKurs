package homework_11_09_23;

public class Department {
    private String depName;
    private int depId;
    private static Employee employees[];

    public Department() {
    }

    public String getDepName() {
        return depName;
    }

    public static Employee[] getEmployees() {
        return employees;
    }

    public Department(String depName, int depId, Employee[] employees) {
        this.depName = depName;
        this.depId = depId;
        this.employees = employees;
    }
}
