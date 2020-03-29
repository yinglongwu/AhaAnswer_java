package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1741. 名字与成绩
public class Main7_4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//这里使用next()获取输入，自动切开空格
		String name1 = scanner.next();
		int score1 = scanner.nextInt();
		String name2 = scanner.next();
		int score2 = scanner.nextInt();
		
		if (score1>score2) {
			System.out.println(name1);
		} else if (score1<score2) {
			System.out.println(name2);
		} else {
			System.out.println("equal");
		}
	}

}
