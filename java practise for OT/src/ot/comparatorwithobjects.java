package ot;
import java.util.*;
class employee
{
	 int[] number=new int[3];
	Scanner in=new Scanner(System.in);
	employee()
	{
		System.out.println(this);
		for(int i=0;i<3;i++)
		{
			number[i]=in.nextInt();
		}
	}
	public void data(employee a)
	{
		System.out.print(a.number);
	}
}
public class comparatorwithobjects {
	public static void main(String[] args) 
	{
		employee[] b=new employee[5];
		//ArrayList<employee> list=new ArrayList<employee>();
		for(int i=0;i<5;i++)
			b[i]=new employee();
		//employee[] a=list.toArray(new employee[list.size()]);

		Arrays.sort(b,new Comparator<employee>() {
			public int compare(employee a,employee b)
			{
				int c=1,i=0;
				while(c==1)
				{
					if(a.number[i]>b.number[i])
					{
						c=0;
						return 1;
						
					}
					else if(a.number[i]<b.number[i])
					{
						c=0;
						return -1;
					}
					else
					{
					i++;
					}
				}
				return 0;
			}
		});
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(b[i].number[j]+" ");
			System.out.println();
		}
	}
}
