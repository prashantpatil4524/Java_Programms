// 4. Write a program to calculate the Area of a Triangle.
import java.util.Scanner;
public class Triangle_areaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);
        sc.close();
    }
}