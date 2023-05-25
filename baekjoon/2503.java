import java.io.*;
import java.util.*;

public class Main {
	private static int strike;
	private static int ball;
	
	static class Mention {
		String guess;
		int strike;
		int ball;
		
		public Mention(String line) {
			String[] temp = line.split(" ");
			
			guess = temp[0];
			strike = Integer.parseInt(temp[1]);
			ball = Integer.parseInt(temp[2]);
		}
	}
	
	private static boolean isValid(String s) {
		if (s.charAt(0) == s.charAt(1)) return false;
		if (s.charAt(0) == s.charAt(2)) return false;
		if (s.charAt(1) == s.charAt(2)) return false;
		
		for (int i = 0; i < 3; i++) {
			if (s.charAt(i) == '0') return false;
		}
		
		return true;
	}
	
	private static void count(String target, String guess) {
		
		int numStrike = 0;
		int numBall = 0;
		
		for (int i = 0; i < 3; i++) {
			char c = guess.charAt(i);
			
			for (int j = 0; j < 3; j++) {
				if (i == j && c == target.charAt(j)) numStrike++;
				if (i != j && c == target.charAt(j)) numBall++;
			}
		}
		
		strike = numStrike;
		ball = numBall;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		
		int N = Integer.parseInt(line);
		
		Mention[] mentions = new Mention[N];
		
		for (int i = 0; i < N; i++) {
			line = br.readLine();
			mentions[i] = new Mention(line);
		}
		
		int numPossible = 0;
		
		for (int i = 123; i <= 999; i++) {
			String target = Integer.toString(i);
			
			if (isValid(target)) {
				boolean isPossible = true;
				
				for (int j = 0; j < N; j++) {
					Mention m = mentions[j];
					
					count(target, m.guess);
					
					
					if (m.strike == strike && m.ball == ball) continue;
					else {
						isPossible = false;
						break;
					}
				}
				
				if (isPossible) numPossible++;
			}
		}
		
		bw.write(numPossible + "");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
