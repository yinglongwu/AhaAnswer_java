package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1741. ������ɼ�
public class Main7_4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//����ʹ��next()��ȡ���룬�Զ��п��ո�
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
