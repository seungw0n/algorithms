import java.io.*;
import java.util.Arrays;

public class Main {
	private static int getMinimum(int[] sides) {
		int min = Integer.MAX_VALUE;
		
		for (int side: sides) {
			min = (side < min) ? side : min;
		}
		
		return min;
	}
	
	private static int getTwoSides(int[] sides) {
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (i + j != 5) min = Math.min(sides[i] + sides[j], min);
			}
		}
		
		return min;
	}
	
	private static int getThreeSides(int[] sides) {
		int min = Integer.MAX_VALUE;
		
		if (sides[0] > sides[5]) min = sides[5];
		else min = sides[0];
		
		if (sides[1] > sides[4]) min += sides[4];
		else min += sides[1];
		
		if (sides[2] > sides[3]) min += sides[3];
		else min += sides[2];
		
		
		return min;
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		
		int N = Integer.parseInt(line);
		
		int[] sides = new int[6];
		
		line = br.readLine();
		String[] temp = line.split(" ");
		
		
		for (int i = 0; i < 6; i++) {
			sides[i] = Integer.parseInt(temp[i]);
		}
		
		long result = 0;
		
		if (N == 1) {
			Arrays.sort(sides);
			
			result = sides[0] + sides[1] + sides[2] + sides[3] + sides[4];
		} else if (N == 2) {
			result = getThreeSides(sides) * 4;
			result += (getTwoSides(sides) * 4);
		} else {
			long three = 4;
			long two = 8 * N - 12;
			long one = 5 * (long)N * (long)N - 16 * (long)N + 12;		
			
			three *= getThreeSides(sides);
			two *= getTwoSides(sides);
			one *= getMinimum(sides);
			
			result = three + two + one;
		}
		
		
		bw.write(result + "");
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
