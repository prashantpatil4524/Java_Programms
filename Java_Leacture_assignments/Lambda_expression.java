// Simple Problem Statement: Lambda Expression in Java
// A company maintains a list of employee salaries. The developer needs to write a Java program to display all salaries greater than 50,000 from the list.
// The program should use Lambda Expression to filter and display the salaries instead of using traditional loops.
// Input:
// List of employee salaries: 30000, 55000, 70000, 45000, 80000
// Task:
// Use a Lambda Expression with Java Stream API to print only the salaries greater than 50,000.
// Expected Output:
// 55000
// 70000
// 80000




















import java.util.*;
public class Lambda_expression {
    public static void main(String[] args) {
        // List of employee salaries
        List<Integer> salaries = Arrays.asList(30000, 55000, 70000, 45000, 80000);
        System.out.println("Salaries greater than 50000:");
        // Using Lambda Expression with Stream API
        salaries.stream()
                .filter(s -> s > 50000)
                .forEach(s -> System.out.println(s));
    }
}


// import java.util.*;

// public class LambdaExample {
//     public static void main(String[] args) {

//         List<Integer> salaries = Arrays.asList(30000, 55000, 70000, 45000, 80000);

//         salaries.forEach(s -> {
//             if(s > 50000) {
//                 System.out.println(s);
//             }
//         });

//     }
// }