/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;
import java.util.*;
/**
 *
 * @author praveen G
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public Queue()
    {
        int id=10;
        int rg=20;
        int date=17;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Queue a=new Queue();
        PriorityQueue q=new PriorityQueue();
        q.add(a);
        for(Object z :q)
        {
        System.out.print(z);
        }
        
    }

    
}
