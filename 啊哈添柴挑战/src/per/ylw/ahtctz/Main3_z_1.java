package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1022. ÊÕ¼¯Æ¿¸ÇÓ®´ó½±
public class Main3_z_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x>=10||y>=20) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		sc.close();
	}

}
