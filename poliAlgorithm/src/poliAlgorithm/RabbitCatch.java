package poliAlgorithm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class RabbitCatch {
	static int N;
	static int FR;
	static int FC;
	static int[] RR;
	static int[] RC;
	static int AnswerN;
	static int count;

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("C:/Users/SMART-11/Desktop/politech_homework/04. 토끼잡기/sample_input.txt"));

		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 2; test_case++) {

			N = sc.nextInt();
			FR = sc.nextInt();
			FC = sc.nextInt();
			RR = new int[N];
			RC = new int[N];

			for (int i = 0; i < N; i++) {
				RR[i] = sc.nextInt();
				RC[i] = sc.nextInt();
			}

			int[][] map = new int[20][20];

			map[FR - 1][FC - 1] = 2;
			for (int i = 0; i < N; i++) {
				map[RR[i] - 1][RC[i] - 1] = 1;
			}

			FR--;
			FC--;
			for (int c = 0; c < 20; c++) {
				if (map[FR][c] == 1) {
					System.out.println("$1 " + c);
					count++;
				}
				if (map[c][FC] == 1) {
					System.out.println("$2 " + c);
					count++;
				}
			}
			for (int c = 0; c < 20; c++) {
				if ((FR + c) < 20 && (FC + c) < 20 && map[FR + c][FC + c] == 1)
					count++;
			}
			for (int c = 0; c < 20; c++) {
				if ((FR - c) >= 0 && (FC - c) >= 0 && map[FR - c][FC - c] == 1)
					count++;
			}
			for (int c = 0; c < 20; c++) {
				if ((FR - c) >= 0 && (FC + c) < 20 && map[FR - c][FC + c] == 1)
					count++;
			}
			for (int c = 0; c < 20; c++) {
				if ((FR + c) < 20 && (FC - c) >= 0 && map[FR + c][FC - c] == 1)
					count++;
			}

			AnswerN = count;
			count = 0;

			System.out.println("#" + test_case + " " + AnswerN);
		}
	}
}
