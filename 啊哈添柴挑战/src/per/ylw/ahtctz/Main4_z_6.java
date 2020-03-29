package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1499. 骡子和担子
public class Main4_z_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= a; j++) {
				for (int k = 0; k <= a; k=k+2) {//注意小骡子两匹挑一个担子
					if (i+j+k==a && i*3+j*2+k/2==b) {
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
		}
		scanner.close();
	}

}
