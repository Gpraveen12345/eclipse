/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;
import java.util.*;
/**
 *
 * @author praveen G
 */
public class Stack {

   //error in name goto queue

   public static void main(String args[]) {
	   //Stack<Integer> s=new Stack<Integer>(); 
	   //goto queue;
	   ArrayList a=new ArrayList();
	   a.add(1);
	   a.add("praveen");
	   a.add(95);
	   ArrayList b=new ArrayList();
	   b.add(a);
	   a=new ArrayList();
	   a.add(1);
	   a.add("pavan");
	   a.add(99);
	   b.add(a);
	   a=new ArrayList();
	   a.add(1);
	   a.add("praveen");
	   a.add(99);
	   b.add(a);
	   Collections.sort(b,new Comparator<ArrayList>() {
		   public  int compare(ArrayList a,ArrayList b)
		   {
			   for(int i=0;i<1;i++)
			   {
				   if((Integer)a.get(i)>((Integer) b.get(i)))
				   {
					   return -1;
				   }
				   else if(!(a.get(i).equals(b.get(i))))
				   {
					   return 1;
				   }
			   }
			   if((((String)a.get(1)).compareTo((String)b.get(1)))<1)
			   {
				   return -1;
			   }
			   else
			   {
				   return 1;
			   }
		   }
	   });
	   System.out.println(b);
    }
    
}
