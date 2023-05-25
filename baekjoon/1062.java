import java.io.*;

public class Main {
	private static boolean[] alphabets;
	private static String[] words;
	private static int max;
	
	private static void count() {
		int cnt = 0;
		
		for (String word: words) {
			boolean flag = true;
			
			for (int i = 0; i < word.length(); i++) {
				if (alphabets[word.charAt(i) - 'a']) continue;
				flag = false;
				break;
			}
			
			if (flag) cnt++;
		}
		
		max = Math.max(max, cnt);
	}
	
	
	private static void search(int index, int K) {
		if (K == 0) {
			count();
			return;
		}
		
		for (int i = index; i < 26; i++) {
			if (!alphabets[i] && K > 0) {
				alphabets[i] = true;
				search(i, K-1);
				alphabets[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		
		int N = Integer.parseInt(line.split(" ")[0]);
		int K = Integer.parseInt(line.split(" ")[1]);
		
		if (K < 5) bw.write("0");
		else if (K == 26) bw.write(N + "");
		else {
			
			words = new String[N];
			
			for (int i = 0; i < N; i++) {
				words[i] = br.readLine();
			}
			
			alphabets = new boolean[26];
			
			alphabets[0] = true; // a
			alphabets['n' - 'a'] = true;
			alphabets['t' - 'a'] = true;
			alphabets['i' - 'a'] = true;
			alphabets['c' - 'a'] = true;

			K -= 5;
			
			search(0, K);
			
			bw.write(max + "");
			
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
