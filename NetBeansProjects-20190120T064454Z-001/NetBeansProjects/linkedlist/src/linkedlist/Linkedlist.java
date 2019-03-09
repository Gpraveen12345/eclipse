/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

/**
 *
 * @author praveen G
 */
import java.util.*;
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList a=new LinkedList();
        LinkedList b=new LinkedList();
        b.add(1);
        b.add("praveen");
        a.add(b);
        b=new LinkedList();
        b.add(2);
        b.add("pavan");
        a.add(b);
        b=(LinkedList) ((LinkedList) a.get(0)).clone();
        System.out.println(b.get(0));
        LinkedHashSet lisset=new LinkedHashSet(a);
        for(Object z:lisset)
        {
        	System.out.print(z+" ");
        }
        System.out.println();
        System.out.println(lisset.containsAll(a));
        String s="abc";
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());

        for(Object z:a)
        {
            System.out.println(((LinkedList)z).get(0));
        }
        
        
    }
    
}
