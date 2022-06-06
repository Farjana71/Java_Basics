package Java_Basic;

public class StaticVsNonStatic {
	
	 static int num = 50;
	  int num2 = 60;
	 
	public static void main(String[] args) {
		
	
		System.out.println(num);
		//ClassName objName = new ClassName();
		StaticVsNonStatic obj = new StaticVsNonStatic();
		System.out.println(obj.num2  );
		obj.nonStatic();
	}
		
		public void nonStatic() {
         System.out.println(num);
			System.out.println(num2);	

	}
		static {
			System.out.println("static run...........");

}
}