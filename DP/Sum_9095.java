package DP;
/*
 * Created by Seung Won Joeng
 * Copyright © 2020 JSW. All rights reserved.
 * Reference: https://www.acmicpc.net/problem/9095
 */
import java.io.*;

// 1,2,3 더하기 
public class Sum_9095 {
	
	public static int count(int n)
	{
		
		int[] dp = new int[10]; // Since n is a positive number and less than 11.
		/*
		 * Here, I am going to use a dynamic programming to count the number of possibilities.
		 * Case 1) The equation ends with 1;
		 * Case 2) The equation ends with 2;
		 * Case 3) The equation ends with 3;
		 * 
		 * Equation: dp[n] = dp[n-3]+dp[n-2]+dp[n-1]
		 */
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 4;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 3; j < n; j++)
			{
				dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
			}
		}
		return dp[n-1];
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++)
		{
			int n = Integer.parseInt(br.readLine());
			int count = count(n);
			System.out.println(count);
		}
	}
}
