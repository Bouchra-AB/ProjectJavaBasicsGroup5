package ProjecJavaBasicsG5.Q7;

public class FirstTenNumbersOfFibonacci {
    public static void main(String[] args) {
        //Create an array to store the first ten numbers of Fibonacci series.
        int[] numFibo = new int[10];

        numFibo[0] = 0;
        numFibo[1] = 1;

        //Calculate the first ten numbers of Fibonacci
        for (int i = 2; i < numFibo.length; i++) {
            numFibo[i] = numFibo[i - 1] + numFibo[i - 2];
        }

        //Print the first 10 numbers of Fibonacci
        System.out.println("The first ten Fibonacci numbers are:");
        for (int num : numFibo) {
            //System.out.println(num);
            System.out.print(num + " ");
        }
    }
}
