import java.io.*;
import java.util.Arrays;

public class Main {
	private static int[] heights;
	private static int totalHeights;
	private static int x, y;
	
	private static void search() {
		x = 0;
		y = 0;
		
		for (int i = 0; i < heights.length; i++) {
			for (int j = i + 1; j < heights.length; j++) {
				if (heights[i] + heights[j] == (totalHeights - 100)) {
					x = heights[i];
					y = heights[j];
					break;
				}
			}
			
			if (x != 0 && y != 0) break;
			
		}
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		heights = new int[9];
		totalHeights = 0;
		
		for (int i = 0; i < 9; i++) {
			heights[i] = Integer.parseInt(br.readLine());
			totalHeights += heights[i];
		}
		
		search();
		
		int[] answer = new int[7];
		int index = 0;
		
		for (int i = 0; i < 9; i++) {
			if (heights[i] == x || heights[i] == y) continue;
			answer[index] = heights[i];
			index++;
		}
		
		
		Arrays.sort(answer);
		
		for (int i: answer) {
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
