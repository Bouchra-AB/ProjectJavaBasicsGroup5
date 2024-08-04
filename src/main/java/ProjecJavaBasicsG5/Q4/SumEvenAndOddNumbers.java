package ProjecJavaBasicsG5.Q4;

public class SumEvenAndOddNumbers {
    public static void main(String[] args) {
        //Create a 2D array of integers
        int[][] numbers = {
                {5, 4, 8, 12},
                {3, 7, 65, 14},
                {9, 2, 16, 18},
                {11, 20, 22, 25}
        };

        int evenSum = 0;
        int oddSum = 0;

        //calculate the sum of even and odd numbers
        for (int[] number : numbers) {
            for (int num : number) {
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;

                }
            }
        }
        //Print the sum of even and odd numbers
        System.out.println("The sum of even numbers is " + evenSum);
        System.out.println("The sum of odd numbers is " + oddSum);
    }
}
