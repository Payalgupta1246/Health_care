import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Dao {

	public static void display() {
		// TODO Auto-generated method stub
		
		HashMap<String, String> ListOfTest = Map_Test.ListOfTest;

	      for(Map.Entry m: ListOfTest.entrySet())
			{
				System.out.println("................");
				System.out.println("Test id "+m.getKey());
				System.out.println("Test name "+m.getValue());
			}
		


	}

}
