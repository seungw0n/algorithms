import java.io.*;

public class Main {
	private static int target;
	private static int answer;
	
	private static void dfs(int current) {
		if (target == current) {
			answer++;
			return;
		}
		
		if (target < current) return;
		
		for (int i = 1; i <= 3; i++) {
			dfs(current + i);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			answer = 0;
			target = Integer.parseInt(br.readLine());
			
			dfs(0);
			bw.write(answer + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
