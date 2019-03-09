package ot;
import java.util.*;
public class sorthashbyvalue {
	public static void main(String[] args)
	{
		HashMap a=new HashMap<String,Integer>();
		a.put("hiii",12);
		a.put("a",15);
		a.put("c",25);
		System.out.println(a);
		ArrayList<Map.Entry<String, Integer>> arr=new ArrayList<Map.Entry<String, Integer>>(a.entrySet());
		Collections.sort(arr,new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> s1,Map.Entry<String, Integer> s2)
			{
				if((s1.getValue()>s2.getValue()))
				return -1;
				else
					return 1;
			}
		});
		System.out.print(arr);
		//Collections.sort(arr);//error in the program
	}

}
