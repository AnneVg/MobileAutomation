package lesson5;

public class Employee {
    private String name;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private float salary;


    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public  Employee(){

    }

    public Employee(String name, String title, float salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }


}
