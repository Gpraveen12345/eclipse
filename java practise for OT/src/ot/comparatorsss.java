package ot;
import java.util.*; 
import java.lang.*; 
  
public class comparatorsss { 
  
	
	public static void main(String[] args)
	{
		ArrayList a =new ArrayList();
		a.add("string");
		a.add("data");
		a.add("learn");
		Collections.sort(a,new Comparator<String>() {
			public int compare(String o1, String o2) {
				
				return 0;
			}
			
		});
		String[] s= {"string","data","value"};
		Arrays.sort(s,new Comparator<String>() {

			public int compare(String s1,String s2)
			{
				return 0;
			}
		});
		System.out.println(a);
	}
}