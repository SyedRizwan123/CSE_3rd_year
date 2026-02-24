package CSE_1;

public class Session_3 {

	public static void main(String[] args) 
	
	{
		/*for (int i = 1; i <= 5; i++) {
		    System.out.println("Hello Java");
		}*/
		
		//while loop
				/*int i = 1;
		        while (i <= 5) 
		        {
		               System.out.println(i);
		               i++;
		        }*/
		
		
		//do-while
		/*int i = 1;
		do {
		    System.out.println("Hello Java");
		    i++;
		} while (i >= 5);*/
		
		/*int num = 121; // You can change this value to test other numbers
        int temp = num;
        int rev = 0;
        
        while (num != 0) {
            int rem = num % 10;           // Get last digit
            rev = rev * 10 + rem;         // Build reversed number
            num = num / 10;               // Remove last digit
        }

        System.out.println("rev value = " + rev);

        if (temp == rev) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not palindrome");
        }*/
		
		int number=1234;
		int count =0;
		if (number==0) {
			count=1;
		}
		else {
		while (number!=0) {
			int rem=number/10;
			count++;
		}
		}
		System.out.println(count);
		
	}

}
