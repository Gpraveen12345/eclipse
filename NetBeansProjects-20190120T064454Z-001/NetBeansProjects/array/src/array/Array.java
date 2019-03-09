/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array;
import java.util.*;
/**
 *
 * @author praveen G
 */

public class Array {

    /**
     *
     * @return
     */
    public static void add(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
            array[i]=0;
        }
    }
    /*public static String apple()
    {
        return("praveen");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
     int[]a = new int[5];
      int i;
      for(i=0;i<5;i++)
      {
          a[i]=in.nextInt();
      }
      for(i=0;i<5;i++)
      {
          System.out.print(a[i]+" ");
      }
      System.out.println();
      Arrays.sort(a);
      add(a);
      for(i=0;i<5;i++)
      {
      System.out.print(a[i]+" ");
      }
      System.out.println(a);
      //int z[]={1,2,3,4};
     /*List a=new ArrayList();
      a.add(10);
      a.add(20);
      a.add(a);
      a.remove(0);
      a.remove(0);
      Array a=new Array();
      System.out.println(apple());
      */
    }
    
}
/*class Name
{
public static String apple()
    {
        return("praveen");
    }
}*/

