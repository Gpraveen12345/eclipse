package inheritance;
class first{
	 int  a=10,salary;
	 String name,fathername;
 public int firstfun()
	{
		return a;
	}
public void seta(int a )
{
	this.a=a;
}
public  int geta()
{
	return(a);
}
 public String toString()//without this function it will print long the address
 {
	return("value"+a);
 }
}
public class inheritance extends first{
	
public static void main(String[] args)
{
	first f=new first();
	System.out.println(f);
}
}
