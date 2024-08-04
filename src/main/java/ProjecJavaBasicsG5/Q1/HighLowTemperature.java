package ProjecJavaBasicsG5.Q1;

public class HighLowTemperature {
    public static void main(String[] args) {
        //array stores a list of temperatures in degree Fahrenheit °F for a week
        int[] temperatures = {77, 72, 69, 80, 86, 79, 66};

        int max = temperatures[0];
        int min = temperatures[0];

        //Loop through the array to find the highest and lowest temperature for the week
        for(int i = 1; i < temperatures.length; i++){
            if(temperatures[i] > max){
                max = temperatures[i];
            }
            if (temperatures[i] < min){
                min = temperatures[i];
            }
        }

        //Print the highest and lowest temperatures
        System.out.println("The highest temperature of the week is " + max + "°F");
        System.out.println("The lowest temperature of the week is " + min + "°F");

    }
}
