import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
		names.add("XYZ");
		
		
		//Print count of array, whichs name start with "S" using streaming
		Long cnt = names.stream().filter(c -> c.startsWith("S")).count();
		System.out.println("Process2 cnt is: "+cnt);
		
		
		Long countOfB = Stream.of("Manna", "Bappa", "Dipu", "Debsankar").filter(s->
		{
			s.startsWith("B");
		return true;
		}).count();
		
		System.out.println("Direct: "+countOfB);
		
		names.stream().filter(s->s.length()>2).forEach(s->System.out.println(s));
		//Print array which have more thn 2 letter
		names.stream().filter(s->s.length()>2).limit(1).forEach(s->System.out.println(s));
		
	}
	
	//Print work in Caps and whichs are end with A and sort
	public void streamMap()
	{
		Stream.of("Subhankara", "Rahul", "Monika", "Ronika", "Dipika").filter(s->s.endsWith("a"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> namess = Arrays.asList("Amazon", "Amarica", "Animal", "India", "Aabir");
		namess.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Concatinate two list
		//male
	}
	

}
