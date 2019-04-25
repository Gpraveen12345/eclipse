/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package map;
import java.util.*;
/**
 *
 * @author praveen G
 */
public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,Integer> a =new HashMap<Integer,Integer>();
        TreeMap<Integer,Integer> b=new TreeMap<Integer,Integer>();
        b.put(2,5);
        b.put(1,5);
        b.put(6,8);
        System.out.println(b);
        a.put(1,0);
        a.put(2,1);
        a.put(3,5);
        if(a.containsValue(5))//if the element is already present we can increment the value
        {//a.containsKey()
        	int v=(Integer)a.get(2);
        	System.out.println("fdf"+" "+v);
        	a.put(1,++v);
        }
        //Collections.max(a);
        int[] values=new int[a.size()];
        int i=0;
        for(Integer m:a.keySet())
        {
            System.out.println(m+" "+a.get(m));
            values[i]=(int)a.get(m);
            i++;
            
           // a.remove(1);   
        }
        ArrayList lis=new ArrayList(a.keySet());
        for(Object z:lis)
        {
        	System.out.print(z);
        }
     // get the keys of the HashMap returned as an Array
     		//String[] key = a.keySet().toArray();


        //System.out.println((String)a.get(3));//this is used to get the value casting is required because it returns object
        /*for(Map.Entry m:a.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  */
         
         System.out.print(a);
       
    }
    
}
