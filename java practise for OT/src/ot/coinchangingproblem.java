package ot;

import java.util.Arrays;

public class coinchangingproblem {
	public static void main(String[] args)
	{
		int n=13;
		int [] arr= {7,2,3,6};
		int[] dp=new int[n+1];
		Arrays.fill(dp,Integer.MAX_VALUE-1);
		dp[0]=0;
		for(int j=0;j<arr.length;j++)
		{
			for(int i=arr[j];i<=n;i++)
			{
	
				if(dp[i-arr[j]]+1<dp[i])
				{
					dp[i]=dp[i-arr[j]]+1;
				}
		}
		}
		for(int i=0;i<n+1;i++)
		{
			System.out.println(dp[i]);
		}
	}

}
