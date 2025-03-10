import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Chan", 45000));
        employees.add(new Employee(2, "Kalyan", 45000));
        employees.add(new Employee(3, "Amigo", 60000));

        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}