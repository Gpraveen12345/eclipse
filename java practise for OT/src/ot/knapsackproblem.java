package ot;
import java .util.*;
public class knapsackproblem {
	public static void main(String[] args)
	{
		Scanner in=new Scanner (System.in);
		
		
		int w=7;
		int n=4;
		int[] arr= {1,4,5,7};
		int[]wt= {1,3,4,5};
		int[][] dp=new int[n+1][w+1];
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=w;j++)
			{
				if(wt[i-1]>j)
				{
					dp[i][j]=dp[i-1][j];
				}
				else
				{
					dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-wt[i-1]]+arr[i-1]);
				}
			}
		}
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=w;j++)
			{
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		}
	}

