package WrapperClasses;

import java.util.Scanner;

public class EmployeeClone {
    String name;
    int id;
    double salary;

    
    EmployeeClone(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    
    EmployeeClone cloneEmployee() {
        return new EmployeeClone(this.name, this.id, this.salary);
    }

    
    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();

        System.out.println("Enter Employee Salary:");
        double salary = sc.nextDouble();

        
        EmployeeClone original = new EmployeeClone(name, id, salary);

        
        EmployeeClone clone = original.cloneEmployee();

        
        System.out.println("\nBefore Modification:");
        System.out.print("Original: ");
        original.display();
        System.out.print("Clone   : ");
        clone.display();

       
        sc.nextLine();
        System.out.println("\n--- Modify Original Employee ---");
        System.out.println("Enter new name:");
        original.name = sc.nextLine();

        System.out.println("Enter new salary:");
        original.salary = sc.nextDouble();

        
        System.out.println("\nAfter Modification:");
        System.out.print("Original: ");
        original.display();
        System.out.print("Clone   : ");
        clone.display();

        sc.close();
    }
}
