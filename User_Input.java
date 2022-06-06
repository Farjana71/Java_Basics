package Java_Basic;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {

		
		//DataType VariableName = Value (Variable declaration)
		Scanner input = new Scanner (System.in);
		System.out.print("Please Enter a Number :");  
		int number = input.nextInt() ;
		
		System.out.print("Please Enter a Name :");
	      String name = input.next();
	       
	       System.out.println("Number :" +number);
	       System.out.println("Name :" +name);
		

	}

}
