/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author praveen G
 */
public class Methodoverloading {

    /**
     * @param args the command line arguments
     */
    float add(float a,float b)
    {
        System.out.print("in float");
        return a+b;
    }
    int add( double a,double b)
    {
        return(int)(a+b);
    }
    
    public static void main(String[] args) {
        int a=1,b=2;
        Methodoverloading m=new Methodoverloading();
        System.out.println(m.add(a,b));
        System.out.println(m.add(1.5,2.80));
        // TODO code application logic here
    }
    
}
