package ot;

public class selve {
	public static void main(String[] args)
	{
		int a=200;
		boolean[] b=new boolean[a];
		for(int i=0;i<a;i++)
		{
			b[i]=true;
		}
		for(int i=2;i*i<=a;i++)
		{
			if(b[i]==true)
			{
			for(int j=i*2;j<a;j+=i)
			{
				b[j]=false;
			}
		}
		}
		for(int i=2;i<a;i++)
		{
			if(b[i]==true)
			{
				System.out.println(i);
			}
		}
	}

}
