//take 5 input from user and store it in array and display it
import java.util.Scanner;
class array_demo{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
        	System.out.println("Total numbers : ");
        	int n = sc.nextInt();
        
        	System.out.println("Enter the Numbers : ");
        	int[] numbers = new int[n];
        	for (int i = 0; i < n; i++) {
            		numbers[i] = sc.nextInt();
        	}
		
		for (int i = 0; i < n; i++) {
            		System.out.print(numbers[i]);
        	}
	
	}
}