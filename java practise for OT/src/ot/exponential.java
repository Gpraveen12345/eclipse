package ot;

import java.util.Scanner;

public class exponential {
	public static void main(String[] args)
	{
       Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       int val=1;
       while(b>0)
       {
    	   int ex=b%2;
    	   if(ex==1)
    	   {
    		  val=val*a; 
    		  System.out.println(val+" "+a);
    	   }
    	   a*=a;
    	   b=b/2;
       }
       System.out.print(val+" "+a);
}

}
