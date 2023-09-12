package homework_11_09_23;

public class Employee {
    private String name;
    private String surName;
    private double salary;
    private int depId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surName, double salary, int depId) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.depId = depId;

    }
}
