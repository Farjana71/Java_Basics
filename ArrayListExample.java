package Java_Basic;
import java.util.ArrayList;
public class ArrayListExample{

	public static void main(String[] args) {
	
		ArrayList<String> nameList = new ArrayList<String>();
		
          nameList.add("name1");
          nameList.add("name2");
          nameList.add("name3");
          System.out.println(nameList.size());
         
          
         // names.remove(1);
         // System.out.println(names);
        //  System.out.println(names.get(2));
          
         // for(int i =0; i<names.size(); i++) {
        	  //System.out.println(names.get(i));
//	}  
        	  //foreach loop()
        	  for(String loopValue: nameList) {
        		  System.out.println(loopValue);
        	  }
}
          }
          
          
	}

}
