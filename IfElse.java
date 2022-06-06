package Java_Basic;

import java.util.Scanner;

public class IfElse{

		public static void main(String[] args) {
			
			Scanner input = new Scanner (System.in);
			
			//DataType VariableName = Value (Variable declaration)
		
			System.out.print("Please Enter First Number :");  
			int number1 = input.nextInt() ;
			
			System.out.print("Please Enter 2nd Number :");
		      int number2 = input.nextInt();
		      
		       if(number1>number2){
		    	  System.out.println("Number "+number1+" is greater than Number"+number2);
		       }else if(number1 == number2) {
					 System.out.println("Number "+number1+" is equal Number"+number2);
		       }else
		    	   System.out.println("Number "+number1+" is less than Number"+number2);
		
		
		    	  
		      }
		      

		}


	




