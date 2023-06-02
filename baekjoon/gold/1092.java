import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
	private static int N, M, ans = -1;
	private static ArrayList<Integer> crains, boxes;
	
	
	private static void greedy() {
		Collections.sort(crains, Collections.reverseOrder());
		Collections.sort(boxes, Collections.reverseOrder());
		
		if (crains.get(0) < boxes.get(0)) return;
		
		ans = 0;
		int numMoved = 0;
		
		while (true) {
			for (int i = 0; i < N; i++) {
				int crainWeight = crains.get(i);
				
				int index = 0;
				while (index < boxes.size()) {
					
					if (crainWeight >= boxes.get(index)) {
						numMoved++;
						boxes.remove(index);
						
						break;
					}
					
					index++;
				}
			}
			
			ans++;
			
			if (numMoved == M) break;
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		N = Integer.parseInt(line);
		
		crains = new ArrayList<>();
		
		line = br.readLine();
		String[] temp = line.split(" ");
		
		for (int i = 0; i < N; i++)
			crains.add(Integer.parseInt(temp[i]));
		
		line = br.readLine();
		M = Integer.parseInt(line);
		
		boxes = new ArrayList<>();
		
		line = br.readLine();
		temp = line.split(" ");
		
		for (int i = 0; i < M; i++)
			boxes.add(Integer.parseInt(temp[i]));
		
		
		greedy();
		
		bw.write(ans + "");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
