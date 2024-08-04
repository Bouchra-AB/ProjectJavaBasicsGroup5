package ProjecJavaBasicsG5.Q8;

public class MaxMinNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 67, 5, 36, 11, 98, 1, 20, -7};
        int max = numbers[0];
        int min = numbers[0];

        //Find the maximum and minimum number in the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        //Print the maximum and minimum number
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }
}
