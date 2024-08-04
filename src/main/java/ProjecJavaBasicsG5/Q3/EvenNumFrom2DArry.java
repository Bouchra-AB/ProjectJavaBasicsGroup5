package ProjecJavaBasicsG5.Q3;

public class EvenNumFrom2DArry {
    public static void main(String[] args) {
        //Create an integer 2D array
        int[][] numbers = {
                {2, 7, 18, 50},
                {17, 5, 20, 4},
                {16, 19, 31, 11, 34}
        };

        //Loop through the 2D array to identify and print the even numbers
        System.out.println("The even numbers in the array are: ");
        for (int[] number : numbers) {
            for (int num : number) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }

    }
}
