package Java_Basic;

import java.util.Scanner;

public class Method {

	static void summation (int num1, int num2) {
		   int sum = num1+num2;
		   System.out.println("Total : "+sum);
	}
	
	static void condition(int number1, int number2) {
		  if(number1>number2){
	    	  System.out.println("Number "+number1+" is greater than Number"+number2);
	       }else if(number1 == number2) {
				 System.out.println("Number "+number1+" is equal Number"+number2);
	       }else
	    	   System.out.println("Number "+number1+" is less than Number"+number2);
	
	
	}
	public static void main(String[] args) {

			Scanner input = new Scanner (System.in);
			
			//DataType VariableName = Value (Variable declaration)
		
			System.out.print("Please Enter First Number :");  
			int number1 = input.nextInt() ;
			
			System.out.print("Please Enter 2nd Number :");
		      int number2 = input.nextInt();
		      summation(number1, number2);
		   condition(number1, number2);

	}

}
