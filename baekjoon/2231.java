import java.io.*;

public class Main {
	private static int ans;
	
	private static int sum(int num) {
		int result = num;
		
		String temp = Integer.toString(num);
		
		for (int i = 0; i < temp.length(); i++) {
			result += (temp.charAt(i) - '0');
		}
		
		return result;
	}
	
	private static void find(int number) {
		for(int i = 1; i < number; i++) {
			int sum = sum(i);
			
			if (sum == number) {
				ans = i;
				break;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		ans = 0;
		find(N);
		
		bw.write(ans + "");

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
