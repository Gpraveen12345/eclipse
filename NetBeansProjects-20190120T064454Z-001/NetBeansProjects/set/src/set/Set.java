/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package set;
import java.util.*;
public class Set {
    public static void main(String[] args) {
        // TODO code application logic here
HashSet setB = new HashSet();
LinkedHashSet setC = new LinkedHashSet();
TreeSet setD = new TreeSet();
      HashSet<Integer> sa=new HashSet();
        sa.add(1);
        String[] s={"pa","re"};
        sa.add(2);
        //Collections.max(sa);
       // System.out.println(((List) sa).get(0));
       // sa.add("praveen");
//       ArrayList<Integer> b=new ArrayList(sa);
//       //System.out.println(b.get(0));
//
//        //System.out.print(s1[0]);
//       for(Object a:b)
//       {
//          
//           System.out.print((int)a+1+" ");
//       }
       //System.out.print(sa);
       TreeSet<String> hset = new TreeSet();
       
       //add elements to HashSet
       hset.add("Steve");
       hset.add("Matt");
       hset.add("Govinda");
       hset.add("John");
       hset.add("Tommy");
       
      System.out.println(hset.ceiling("A"));
      
       // Displaying HashSet elements
       System.out.println("HashSet contains: "+ hset);
   
       // Creating a List of HashSet elements
       List<String> list = new ArrayList<String>(hset);
   
       // Displaying ArrayList elements
       System.out.println("ArrayList contains: "+ list);
        
    }   
}