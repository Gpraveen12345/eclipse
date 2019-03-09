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
        LinkedHashSet<Integer> sa=new LinkedHashSet();
        sa.add(1);
        String[] s={"pa","re"};
        sa.add(2);
       // sa.add("praveen");
       ArrayList b=new ArrayList(sa);

        //System.out.print(s1[0]);
       for(Object a:b)
       {
          
           System.out.print((int)a+1+" ");
       }
       //System.out.print(sa);
        
    }   
}