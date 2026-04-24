import java.util.Scanner;
import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Popped: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;

                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Top: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;

                case 4:
                    System.out.println("Stack: " + stack);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}