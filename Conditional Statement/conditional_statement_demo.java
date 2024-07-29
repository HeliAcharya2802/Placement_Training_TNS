//Use Any conditional statement and print grade of students 
import java.util.Scanner;
class conditional_statement_demo{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter your Grades : ");
        	float grade = sc.nextFloat();
        
        	if(grade > 90){
            		System.out.print("Grade A");
        	}
		else if(80 < grade && grade < 90 ){
			System.out.print("Grade B");
		}
		else if(grade < 80 ){
			System.out.print("Grade C");
		}
		
	
	}
}