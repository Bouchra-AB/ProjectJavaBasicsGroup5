package ProjecJavaBasicsG5.Q7;

public class RecursiveFibonacci {
    public static void main(String[] args) {

        // Number of Fibonacci numbers to print
        int number = 10;

        System.out.println("The first " + number + " numbers of the Fibonacci series are:");

        // Print the Fibonacci series using recursion
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacciNumbers(i) + " ");
        }
    }

    // Recursive function to calculate Fibonacci numbers
    public static int fibonacciNumbers(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return fibonacciNumbers(n - 1) + fibonacciNumbers(n - 2);
    }

}
