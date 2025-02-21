import java.util.Scanner;
class Factorial {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt(); 
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}

/* this program is to find the factorial of a number
This method calculates the factorial of a given number using an iterative approach with a for loop. 
It initializes fact = 1 and multiplies it by each number from 1 to n, ensuring an efficient and memory-safe calculation. 
Iteration avoids the risk of stack overflow, making it suitable for large numbers.

OUTPUT:
Enter a number :5
Factorial of 5 is: 120

*/
