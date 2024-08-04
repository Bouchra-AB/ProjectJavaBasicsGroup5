package ProjecJavaBasicsG5.Q2;

public class SumOfAllValuesInArray {
    public static void main(String[] args) {
        //Create an array of integer values
        int[] values = {13, 56, 8, 90, 102, 5, 20, 11};

        int sum = 0;

        //Calculate the sum of all elements in the array
        for (int num : values) {
            sum += num;
        }

        //Print the sum
        System.out.println("The sum of all values is " + sum);

    }
}
