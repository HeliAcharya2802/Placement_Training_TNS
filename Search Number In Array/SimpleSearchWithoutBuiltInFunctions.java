//search number in array

import java.util.Scanner;

public class SimpleSearchWithoutBuiltInFunctions {
    public static void main(String[] args) {
        
        int[] array = {3, 5, 7, 9, 11}; 

        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number you want to search for: ");
        int target = scanner.nextInt();

        boolean found = linearSearch(array, target);

      
        if (found) {
            System.out.println("Number " + target + " is present in the array.");
        } else {
            System.out.println("Number " + target + " is not present in the array.");
        }

     
        scanner.close();
    }


    public static boolean linearSearch(int[] array, int target) {
  
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] == target) {
                return true; 
            }
        }
        return false; // Number not found
    }
}
