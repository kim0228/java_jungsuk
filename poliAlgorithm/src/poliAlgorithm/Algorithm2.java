package poliAlgorithm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Algorithm2 {
	static int N;
	static int AnswerN;
	static int[] E1;
	static int[] E2;
	
	public static void main(String[] args) throws IOException{
		System.setIn(new FileInputStream("C:/Users/SMART-11/Desktop/politech_homework/02. 수열/sample_input.txt"));
		Scanner sc = new Scanner(System.in);
				
		for (int test_case = 1; test_case <= 4; test_case++) {
			
			N = sc.nextInt();
			
			E1 = new int[N];
			for (int col = 0; col < N; col++) {
				E1[col] = sc.nextInt();
			}
			
			E2 = new int[N];
			for (int col = 0; col < N; col++) {
				E2[col] = sc.nextInt();
			}
			
			boolean C[] = new boolean[N];
			
			for(int i = 0;i < N; i++) {
				for (int j = 0; j < N; ++j) {
					if(C[j] == false && E1[i] == E2[j]) {
						C[j] = true;
						break;
					}
				}
			}
			
			AnswerN = 1;
			
			for(int i = 0; i < N;++i) {
				if (C[i] == false) {
					AnswerN = 0;
					break;
				}
			}
			
			Arrays.sort(E1);
			Arrays.sort(E2);
			
			if (Arrays.equals(E1, E2)) {
				AnswerN = 1;
			} else {
				AnswerN = 0;
			}
			

			System.out.println("#" + test_case + " " + AnswerN);
		}
		
	}
}
