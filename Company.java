import java.util.Scanner;

// Base class Employee
class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.10; // 10% bonus for employees
    }

    public void generateReport() {
        System.out.println(name + "'s Report:");
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }
}

// Subclass Manager
class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% bonus for Manager
    }
}

// Subclass Developer
class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // 15% bonus for Developer
    }

    public void writeCode() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }
}

// Subclass Programmer
class Programmer extends Developer {
    public Programmer(String name, double salary, String programmingLanguage) {
        super(name, salary, programmingLanguage);
    }

    public void debugCode() {
        System.out.println(name + " is debugging code.");
    }
}

public class Company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Manager
        System.out.println("Enter Manager's name: ");
        String managerName = scanner.nextLine();
        System.out.println("Enter Manager's salary: ");
        double managerSalary = scanner.nextDouble();
        Manager manager = new Manager(managerName, managerSalary);

        // Input for Developer
        scanner.nextLine(); // Consume the remaining newline character
        System.out.println("Enter Developer's name: ");
        String devName = scanner.nextLine();
        System.out.println("Enter Developer's salary: ");
        double devSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline character
        System.out.println("Enter Developer's programming language: ");
        String devLang = scanner.nextLine();
        Developer developer = new Developer(devName, devSalary, devLang);

        // Input for Programmer
        System.out.println("Enter Programmer's name: ");
        String progName = scanner.nextLine();
        System.out.println("Enter Programmer's salary: ");
        double progSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline character
        System.out.println("Enter Programmer's programming language: ");
        String progLang = scanner.nextLine();
        Programmer programmer = new Programmer(progName, progSalary, progLang);

        // Generate performance reports
        manager.generateReport();
        System.out.println();

        developer.generateReport();
        developer.writeCode();
        System.out.println();

        programmer.generateReport();
        programmer.debugCode();
    }
}
