import java.io.*;

public class Main {
	private static int[] triangles;
	private static int ans;
	
	private static void dfs(int count, int numLeft) {
		if (count == 3 && numLeft == 0) {
			ans = 1;
			return;
		}
		if (count == 3) return;
		if (numLeft <= 0) return;
		
		for (int i = 1; i < triangles.length; i++) {
			int n = numLeft - triangles[i];
			dfs(count+1, n);
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		triangles = new int[46];
		
		for (int i = 1; i <= 45; i++) {
			triangles[i] = i * (i+1) / 2;
		}
		
		
		String line = br.readLine();
		int T = Integer.parseInt(line);
		
		
		for (int i = 0; i < T; i++) {
			ans = 0;
			
			dfs(0, Integer.parseInt(br.readLine()));
			bw.write(ans + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
