package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1025. 有一门课不及格的学生
public class Main3_z_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if ((x<60&&y>=60)||(y<60&&x>=60)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		scanner.close();
	}

}
