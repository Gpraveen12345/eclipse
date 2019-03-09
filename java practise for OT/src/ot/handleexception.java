package ot;
class hii extends Thread
{
	//public void show()
	public void run()//show change this to run
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hii");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class hello extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class handleexception  {
	
	public static void main(String[] args)
	{
		try {
			int a=2/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("exception doesn't stop the programe");
		
		hii obj1=new hii();
		hello obj2=new hello();
		obj1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		
	}
}
