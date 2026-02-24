package CSE_1;
import java.util.Scanner;
public class Session_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Number Operations
		
				/*int x=10;
				int y=20;
				
				System.out.println(x+y);
		        System.out.println(5 + 6);      // Addition
		        System.out.println(6 - 5);      // Subtraction
		        System.out.println(10 / 2);     // Division (gives quotient)
		        System.out.println(10 / 2);     // Floor division (same in Java for integers)
		        System.out.println(10 % 2);     // Modulus
		        System.out.println(10 * 2);     // Multiplication */

		//Comparasion Operators
	    /*System.out.println("5 > 2? " + (5 > 2));
        System.out.println("5 < 2? " + (5 < 2));
        System.out.println("5 >= 2? " + (5 >= 2));
        System.out.println("5 <= 2? " + (5 <= 2));
        System.out.println("5 == 3? " + (5 == 3));
        System.out.println("5 != 3? " + (5 != 3));*/
		
		//Assignment Operators
				// Assignment Operators
		        /*int a = 82;
		        int b = 27;
		        a += b;  // a = a + b => a = 82 + 27 = 109
		        System.out.println("a += b => " + a);  // Output: 109
		        
		        a = 25;
		        b = 12;
		        a -= b;  // a = a - b => a = 25 - 12 = 13
		        System.out.println("a -= b => " + a);  // Output: 13

		        a = 24;
		        b = 4;
		        a *= b;  // a = a * b => a = 24 * 4 = 96
		        System.out.println("a *= b => " + a);*/  // Output: 96

		//AND
        /*boolean result1 = (1 == 1) && (0 == 1);  // true && false => false
        System.out.println("1 AND 0 = " + result1); // Output: false
        
     // Logical OR
        boolean result2 = (1 == 1) || (0 == 1);  // true || false => true
        System.out.println("1 OR 0 = " + result2);*/  // Output: true

        /*int a = 10;
        int b = 6;

        System.out.println("a & b = " + (a & b)); // Output: 2
        System.out.println("a | b = " + (a | b)); // Output: 14
        System.out.println("a ^ b = " + (a ^ b)); // Output: 12*/


		//shift OPerators
		/*int x = 10;

		System.out.println("x << 1 = " + (x << 1));  // 20
		System.out.println("x >> 1 = " + (x >> 1));*/  // 5

		
		
		
		//if condition
		//String name ="Welcome to Priyadarshini college";
		
		/*if(5<=2) {
			System.out.println(name);
		}*/
		
		/*if(5<=2) {
			System.out.println(name);
		}
		else {
			System.out.println("False");
	}
	}*/
		
		
		//Leap year
		// Create Scanner object to take input from user
       /* Scanner sc = new Scanner(System.in);
     // Prompt user to enter the year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();  // Reads integer input          
     // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } 
        else
        {
            System.out.println(year + " is not a leap year");
        }

        sc.close();  // Close the scanner object
    }*/
		
		//find the grade
		/*float m1,m2,m3,m4,m5,total,avg;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 5 subject marks");
		m1=sc.nextFloat();
		m2=sc.nextFloat();
		m3=sc.nextFloat();
		m4=sc.nextFloat();
		m5=sc.nextFloat();
		total=m1+m2+m3+m4+m5;
		System.out.println(total);
		
		avg=total/5;
		System.out.println(avg);
		if(avg>=80) {
			System.out.println("A");
		}
		else {
			System.out.println("fail");
			
		}

		sc.close();*/
		
		/*int marks = 85;

		if (marks <= 60) {
		    if (marks >= 80) {
		        System.out.println("Distinction");
		    } else {
		        System.out.println("First Class");
		    }
		} else {
		    System.out.println("Fail");
		}*/
		

		//else-if
		int val = 88;

        if (val >= 100) {
            System.out.println("value is equal or greater than 100");
        } else if (val > 10 && val >= 0) {
            System.out.println("value is greater than 10 but less than 100");
        } else if (val < 0) {
            System.out.println("value is less than 0");
        } else {
            System.out.println("value is equal or less than 10");
        }


}

}