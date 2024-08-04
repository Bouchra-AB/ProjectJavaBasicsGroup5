package ProjecJavaBasicsG5.Q5;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        //Create and initialize two variables
        int a = 5;
        int b = 7;

        //Print before swap
        System.out.println("The numbers before swap:");
        System.out.println("a = " + a + " and b = " + b);
        //Swap the numbers without a temporary variable
        a += b;
        b = a - b;
        a -= b;

        //Print after swap
        System.out.println("The numbers after swap:");
        System.out.println("a = " + a + " and b = " + b);
    }
}
