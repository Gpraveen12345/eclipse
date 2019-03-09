package ot;
class Animal {  
int salary=1000;  
}  
class Dog extends Animal{  
String color="black"; 
int salary=1000;
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.salary);//prints color of Animal class  
}  
}  
class parentclass extends Dog{
	 int salary=1000;
}
class childclass extends parentclass
{
	int salary=100;
	//super.salary;
}


public class inheritance extends childclass {
	public static void main(String[] args)
	{
		childclass s=new childclass();
		parentclass s1=s;
		System.out.print(s.salary+" "+s.salary+" ");
	}

}
