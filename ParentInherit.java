package Java_Basic;

public class ParentInherit {
	
public static void add(int num1, int num2) {
	int sum =num1 +num2;
	System.out.println("sum "+sum);
			
}
  static void helloParent() {
	  System.out.println("This is a Parent Class");
	  
  }
  static int number =50;
  public static void main(String[]args) {
	  add(20,60);
  }
}