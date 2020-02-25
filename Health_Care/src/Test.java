import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void display() {
		// TODO Auto-generated method stub
		
		HashMap<String, String> ListOfTest = Map_Test.ListOfTest;

	      for(Map.Entry m: ListOfTest.entrySet())
			{
				System.out.println("................");
				System.out.println("Test id "+m.getKey());
				System.out.println("Test name "+m.getValue());
			}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		//DataStorage storage = new DataStorage();
		HashMap<String, Integer> people = storage.people;
		
        HashMap<String, String> ListOfTest = list.ListOfTest(); 
		
		Iterator<Map_Test> it=list.keySet().iterator();
		while(it.hasNext())
		{
			int key=(int)it.next();
			System.out.println("................");
			System.out.println("Roll no "+key);
			System.out.println("Student name "+hm.get(key));
		}

		 System.out.println("Initial Mappings are: " +list); 

*/
	
		


	}

}
