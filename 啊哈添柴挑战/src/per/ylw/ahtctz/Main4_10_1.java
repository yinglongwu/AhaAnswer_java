package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1036. ÆæÊýÇóºÍ
public class Main4_10_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m= scanner.nextInt();
		int n= scanner.nextInt();
		int min = m<n?m:n;
		int max = m>n?m:n;
		int sum = 0;
		
		for (int i = min; i <= max; i++) {
			if (i%2!=0) {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);
		scanner.close();
	}

}
