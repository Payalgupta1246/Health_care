import java.util.HashMap;
import java.util.Set;

public class Map_Test {
	static HashMap<String, String> ListOfTest = new HashMap<String, String>();
	public static void main(String[] args) {


	//HashMap<String, String> entrySet() {
		// TODO Auto-generated method stub
         
        ListOfTest.put("101", "Blood Test");
        ListOfTest.put("102", "X-ray");
        ListOfTest.put("103", "MRI");
        ListOfTest.put("104", "CT Scan");
        ListOfTest.put("105", "ECG");
		
		 System.out.println("Initial Mappings are: "); 
		 Test.display();
		  
		 /*
	        	System.out.println("The collection is: " + hm.values()); 
		        System.out.println("The collection is: " + hm.keySet()); 
		        */

		//return ListOfTest;
	}
	
}
