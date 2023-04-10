import java.util.ArrayList;

public class Test1 
{
	public void regular1()
	{
		
		//Count how many name start with S | Process 1
		ArrayList<String> names = new ArrayList<String>();
		names.add("Subhankar");
		names.add("Rahul");
		names.add("Palwesh");
		names.add("Panda");
		names.add("Smriti");
		
		int Count=0;
		
		for(int i = 0; i < names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("S"))
			{
				Count++;
			}
		}
		System.out.println(Count);
	
	}
	//Count how many name start with S | Process 2
	public void regular2()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Subhankar");
		names.add("Rahul");
		names.add("Palwesh");
		names.add("Panda");
		names.add("Smriti");
		
		Long cnt = names.stream().filter(c -> c.startsWith("S")).count();
		System.out.println("Process2 cnt is: "+cnt);
	}
	

}
