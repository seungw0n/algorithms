package Beginner_InputOutput;
// BAEKJOON #2588
import java.util.Scanner;

public class Product_2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int rOne = (b % 100) % 10;
		int rTwo = (b / 10) % 10;
		int rThree = b / 100;
		
		int three = a * rOne;
		int four = a * rTwo;
		int five = a * rThree;
		
		int six = three + four * 10 + five * 100;
		
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		
		sc.close();
		
	}
}
