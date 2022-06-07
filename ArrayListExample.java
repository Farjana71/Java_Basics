package Java_Basic;
import java.util.ArrayList;
public class ArrayListExample{

	public static void main(String[] args) {
	
		ArrayList<String> names = new ArrayList<String>();
		
          names.add("name1");
          names.add("name2");
          names.add("name3");
          System.out.println(names.size());
         
          
         // names.remove(1);
         // System.out.println(names);
        //  System.out.println(names.get(2));
          
          for(int i =0; i<names.size(); i++) {
        	  System.out.println(names.get(i));
        	  
          }
          
          
	}

}
