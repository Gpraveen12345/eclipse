package ot;

public class rabinkarp {
	public static void main(String[] args)
	{
		String s="abcAbcgabdf";
		String p="Abc";
		int prime=11,val,oldval=1,newval=0,count=0;
		for(int i=0;i<p.length();i++)
		{
			
			newval=newval+p.charAt(i)*oldval;
			oldval*=prime;
		}
		val=newval;
		System.out.println(val);
		oldval=1;
		newval=0;
		for(int i=0;i<p.length();i++)
		{
						newval=newval+s.charAt(i)*oldval;
						oldval*=prime;

		}
		System.out.println(newval);
		oldval=oldval/prime;
		if(newval==val)
		{
			count++;
		}
		for(int i=1;i<s.length()-p.length()+1;i++)
		{
			newval=newval-s.charAt(i-1);
			newval=newval/prime;
			newval=newval+s.charAt(i+p.length()-1)*oldval;
			System.out.println(newval);
			if(newval==val)
				count++;
		}
		System.out.println(count);
		
	}

}
