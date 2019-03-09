/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strings;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author praveen G
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String s="1@2@3#4@5@6#7@8@9";
       String[] a=s.split("#");
       String[][] str=new String[3][];
       for(int i=0;i<a.length;i++)
       {
           String[] w=a[i].split("@");
           for(int j=0;j<w.length;j++)
           {
               System.out.println(w[j]);
               str[i][j]=new String("1");
           }
           System.out.println();
       }
      /* for(int i=0;i<str.length;i++)
       {
           for(int j=0;j<str[0].length;j++)
           {
               System.out.println(str[i][j]);
           }
       }*/
        
    	
    	char a='a';
        //System.out.print(new Integer(a));
        System.out.print(a+0);//type casting occurs same as that of new integer
 String s="hiii how are you";
 s=s.replaceAll(" ", "");
/* System.out.println(s.length());
 
 
 String s1,s2,s3;
 s1="haH";
 s2="hBH";
 System.out.println(s1.compareTo(s2));
 System.out.println(s1.compareToIgnoreCase(s2));
 s3="sss ss s s s     ";
 System.out.println(s3.trim());//removes the empty spaces at the last
 
 
 String name="what do you know about me";  
 System.out.println(name.contains("do you know"));  
 System.out.println(name.contains("about"));  
 System.out.println(name.contains("hello"));
 StringBuilder sb=new StringBuilder();
 s="hii how are you ";*/
 System.out.println(s.toLowerCase());
 s=s.toLowerCase();
 Boolean[] b=new Boolean[26];
 Arrays.fill(b,false);

 for(int i=0;i<s.length();i++)
 {
	 b[(s.charAt(i))-'a']=true;
 }
int c=0;
 for(int i=0;i<26;i++)
 {
	 if(b[i]==false)
	 {
		 c=1;
		 break;
	 }
 }
 if(c==1)
 {
	 System.out.println("all charecters are not present");
 }
 else
 {
	 System.out.println("all charecters are present");
 
 }
 //split the range and add them
 s="1-5,6,9,10-20";
 String[] s1=s.split(",");
 for(int i=0;i<s1.length;i++)
 {
	 String[] s2=s1[i].split("-");
	 if(s2.length>=2)
	 {
		 s1[i]="";
			int num1=Integer.parseInt(s2[0]);
			int num2=Integer.parseInt(s2[1]);
			for(int j=num1;j<num2;j++)
			{
			s1[i]=s1[i]+j+',';
			}
			s1[i]=s1[i]+num2;
	 }
 }
 s="";
 for(int i=0;i<s1.length;i++)
 {
	 s=s+s1[i]+',';
 }
 System.out.println(s);  
 System.out.println('a'+2);
 StringBuilder sb=new StringBuilder(s);
 System.out.println(sb.reverse());
    }
    }
