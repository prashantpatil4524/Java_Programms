// 8. Write a program to calculate the salary of a person (basic + allowances – deductions like this 5 attributes).
import java.util.Scanner;
public class Salery_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();
        System.out.print("Enter allowances: ");
        double allowances = sc.nextDouble();
        System.out.print("Enter deductions: ");
        double deductions = sc.nextDouble();

        double totalSalary = basicSalary + allowances - deductions;

        System.out.println("Total Salary: " + totalSalary);
    }
}
