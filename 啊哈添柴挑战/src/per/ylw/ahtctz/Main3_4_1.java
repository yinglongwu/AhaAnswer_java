package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1020. 判断是否为两位数
public class Main3_4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = Integer.toString(n);
		
		if(s.length()==2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		scanner.close();
	}

}
