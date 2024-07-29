//sum of odd/even numbers
import java.util.Scanner;
class demo{

	public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();


        int[] numbers = new int[n];

  
        int sumOdd = 0;
        int sumEven = 0;

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

       
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number; 
            } else {
                sumOdd += number; 
            }
        }

        System.out.println("Sum of all odd numbers: " + sumOdd);
        System.out.println("Sum of all even numbers: " + sumEven);



		
	}
}