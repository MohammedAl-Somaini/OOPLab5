import java.util.Scanner;
public class Lab5Q10EmployeeTester {
        public static void main(String[] args) {
            double salary,byPercent;
            String name;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter The Name:");
            name=in.next();
            System.out.println("Enter The Salary:");
            salary=in.nextDouble();
            System.out.println("Enter The  Percent:");
            byPercent=in.nextDouble();
            Lab5Q10Employee emp=new Lab5Q10Employee(name,salary);
            emp.raiseSalary(byPercent);
            System.out.println("The Name Is: "+emp.getName());
            System.out.println("The Salary = "+emp.getSalary());
        }
    }
