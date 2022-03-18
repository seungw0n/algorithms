package Beginner_InputOutput;
// BAEKJOON #10039
import java.util.*;

public class Average_10039 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] grades = new int[5];
		
		for(int i = 0; i < 5; i++)
		{
			grades[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i : grades) 
		{
			if(i < 40) sum += 40;
			else sum += i;
		}
		
		System.out.println(sum/5);
		
		sc.close();
	}
}
