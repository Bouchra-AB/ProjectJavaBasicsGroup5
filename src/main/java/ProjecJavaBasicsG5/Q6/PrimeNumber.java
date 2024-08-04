package ProjecJavaBasicsG5.Q6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        boolean prime = true;

        System.out.println("Enter a number to check if it is prime: ");
        number = input.nextInt();

        //Check if the number is prime or not
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        //Print
        if (prime) {
            System.out.println("The number " + number + " is a prime number");
        } else {
            System.out.println("The number " + number + " is not a prime number");
        }
    }
}
