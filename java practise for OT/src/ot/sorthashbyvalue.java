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
		System.out.println(arr.get(0).getKey());
		
		//Collections.sort(arr);//error in the program
	}

}
//public static void main(String[] args)
//{
//	   Scanner in=new Scanner(System.in);
//	     int t=Integer.parseInt(in.nextLine());
//	     int n,x;
//	     ArrayList arr=new ArrayList<Map.Entry<String,Integer>>();
//	     Map m=new HashMap<String,Integer>();
//	     for(int i=0;i<t;i++)
//	     {
//	         m=new HashMap<String,Integer>();
//	         n=Integer.parseInt(in.nextLine());
//	         for(int j=0;j<n;j++)
//	         {
//	             String s=in.nextLine(); 
//	             if(s.split(" ").length>1)
//	             {
//	                 arr=new ArrayList(m.entrySet());
//	                x=s.charAt(4)-'0';
//	                
//	                Collections.sort(arr,new Comparator<Map.Entry<String, Integer>>() {
//	        			public int compare(Map.Entry<String, Integer> s1,Map.Entry<String, Integer> s2)
//	        			{
//	        				if((s1.getValue()>s2.getValue()))
//	        				return -1;
//	        				else if(s1.getValue()<s2.getValue())
//	        				{
//	        					return 1;
//	        				}
//	        				else
//	        				{
//	        					return (s1.getKey()).compareTo(s2.getKey());
//	        				}
//	        					
//	        			}
//	        		});
//	                for(int k=0;k<x && k<arr.size();k++)
//	                {
//	                    System.out.print(((Map.Entry<String,Integer>)arr.get(k)).getKey()+" ");
//	                }
//	                System.out.println(((Map.Entry<String,Integer>)arr.get(0)).getKey());
//	             }
//	             else
//	             {
//		             if(m.containsKey(s))
//		             {
//		                 m.put(s,(int)m.get(s)+1);
//		             }
//		             else
//		             {
//		                 m.put(s,1);
//		             }
//	             }
//	             
//	         }
//	     }
//	 
//}
