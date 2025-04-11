package rajdeep.CC12_Assignment;

abstract class Employee {
    String name;
    int age;
    String designation;
    double salary;

    Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    abstract void calculateSalary();

    abstract void displayDetails();
}

class Manager extends Employee {
    Manager(String name, int age, String designation, double salary) {
        super(name, age, designation, salary);
    }

    void calculateSalary() {
        System.out.println("Manager get yearly bonus of 20% of salary");
        salary += salary * 0.2;
        System.out.println("Salary of Manager is:" + salary);
    }

    void displayDetails() {
        System.out.println("Name of Manager is:" + name);
        System.out.println("Age of Manager is:" + age);
        System.out.println("Designation of Manager is:" + designation);
        System.out.println("Salary of Manager is:" + salary);
    }
}

class Clerk extends Employee {
    Clerk(String name, int age, String designation, double salary) {
        super(name, age, designation, salary);
    }

    void calculateSalary() {
        System.out.println("Clerk get yearly bonus of 10% of salary");
        salary += salary * 0.1;
        System.out.println("Salary of Clerk is:" + salary);
    }

    void displayDetails() {
        System.out.println("Name of Clerk is:" + name);
        System.out.println("Age of Clerk is:" + age);
        System.out.println("Designation of Clerk is:" + designation);
        System.out.println("Salary of Clerk is:" + salary);
    }
}
public class Assignment15_AbstractClassEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager("Amal", 21, "Manager", 100000);
        manager.calculateSalary();
        manager.displayDetails();
        Clerk clerk = new Clerk("Bimal", 21, "Clerk", 100000);
        clerk.calculateSalary();
        clerk.displayDetails();
    }
}
