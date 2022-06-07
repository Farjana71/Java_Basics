package Java_Basic;

import java.util.Scanner;

public class Loop_Java {

	public static void main(String[] args) {
		
     Scanner input = new Scanner (System.in);
     
     System.out.print("Please Enter a Number  :");
     int number = input.nextInt();
     
     
     
    for(int i =0; i<number; i++){
    System.out.println("Number :" +i);
	}

}
}
