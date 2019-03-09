/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author praveen G
 */
class Rectangle{  
 int length;
 int a=10,b=10;
 int width;  
 Rectangle()
 {
     System.out.print("HII");
 }
 /*Rectangle(int a,int b)
 {
     a=2;
     b=2;
     length=a;
     width=b;
     System.out.println(length+" "+width);
 }
 /*Rectangle(Rectangle s)
 {
     length=s.length;
     width=s.width;
     System.out.println(length+" "+width);
 }*/
 int insert(int l,int w){  
  length=l;  
  width=w;
return(l*w);  
 }  

    /**
     * @param args the command line arguments
     */
}
class Rectangle1 extends Rectangle
{
    int insert(int l,int w)
    {
        return(1);
    }
}
class Class extends Rectangle
{
    
    public static void main(String[] args) {
       Class c=new Class();
       Rectangle1 r=new Rectangle1();
       System.out.println(c.insert(1,2));
        //System.out.print(s1.Rectangle());
    int a=2,b=3;
    
       System.out.println(c.insert(a,b));
        //Rectangle s2=new Rectangle(s1);
    }
    
}
