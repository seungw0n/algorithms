package Beginner_InputOutput;
// BAEKJOON #1000
import java.io.*;
import java.util.StringTokenizer;

public class SumAB_1000 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			System.out.println(a+b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
