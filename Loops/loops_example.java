//Loops Example
//In Java we have 2 types of loops : 1) Entry Control loop :- while,for,foreach
			//	     2) Exit Control loop :- do while

class loops_example{

	public static void main(String args[]){

	  
        	System.out.println("Counting using for loop:");
        	for (int i = 1; i <= 5; i++) {
           		 System.out.println(i);
       		 }

       
        	System.out.println("\nCounting using while loop:");
        		int j = 1;
        		while (j <= 5) {
            			System.out.println(j);
            			j++;
        		}

       
        	System.out.println("\nCounting using do-while loop:");
       			 int k = 1;
        		do {
            			System.out.println(k);
            			k++;
        		} while (k <= 5);

	}
} 