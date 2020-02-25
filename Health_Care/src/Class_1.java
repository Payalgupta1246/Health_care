import java.util.Scanner;

public class Class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int id=100;
		String name;
		get_test obj=new get_test();
		for(int i=0;i<5;i++)
		{
			obj.setTestId(id=id+1);
			Integer.toString(id);
			System.out.println(id);
			
		}

	}

}
