package ProjecJavaBasicsG5.Q10;

public class DuplicateElemArray {
    public static void main(String[] args) {

        String[] states = {"Virginia", "Alabama", "California", "Colorado", "Missouri", "Nevada", "Virginia", "Alaska", "Colorado", "Alabama", "Virginia", "Colorado", "Alaska", "Virginia"};

        // Create a boolean array to verify that the element is already checked
        boolean[] checked = new boolean[states.length];
        boolean duplicate;

        System.out.println("Duplicate elements exist in the array are:");

        // Loop through the array
        for (int i = 0; i < states.length; i++) {

            // Verify if an element is already checked as duplicate or not
            if (checked[i]) {
                //If the element is already checked skip the next block of code and go to the next index
                continue;
            }

            //Initialize the variable to false value to check again for duplicated
            duplicate = false;

            //Take one element and compare it to the others.
            for (int j = i + 1; j < states.length; j++) {
                if (states[i].equals(states[j])) {
                    duplicate = true;
                    checked[j] = true;
                }
            }

            // Print the duplicate element
            if (duplicate) {
                System.out.println(states[i]);
            }
        }
    }
}
