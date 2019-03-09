/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pratice;

/**
 *
 * @author praveen G
 */
public class Pratice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1="c";
       int size=0;
       char[] c=str1.toCharArray();
    char temp;
    int i,j;
    if(size==0)
    {
        System.out.print(str1);
    }
    else
    {
    for(i=0;i<str1.length();)
    {
        if(i+size<str1.length())
        {
            for(j=0;j<size/2;j++)
            {
                System.out.print("hii");
                temp=c[i+j];
                c[i+j]=c[i+size-1-j];
                c[i+size-1-j]=temp;
            }
        }
        i=i+size;
    }
    System.out.print(new String(c));
    }
    }
}
