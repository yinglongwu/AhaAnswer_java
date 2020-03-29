package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1672. ∆Â≈Ã£®ºÚªØ∞Ê£©
public class Main6_z_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int[][] arr = new int[m][m];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			arr[x-1][y-1] = scanner.nextInt();
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
