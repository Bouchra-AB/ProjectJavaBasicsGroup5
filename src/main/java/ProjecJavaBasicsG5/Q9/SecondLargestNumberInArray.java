package ProjecJavaBasicsG5.Q9;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 67, 5, 36, 11, 98, 1, 20, -7};
        int max = numbers[0];
        int secondMax = numbers[0];

        //Find the second maximum in the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }

        //Print the second maximum number
        System.out.println("The second maximum number in the array is " + secondMax);

    }
}
