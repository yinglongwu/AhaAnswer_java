package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1052. ������
public class Main5_z_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (isPalindromeNumber(n)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scanner.close();
		
	}
	//�ж��Ƿ�Ϊ������
	public static boolean isPalindromeNumber(int x) {
		String s1 = Integer.toString(x);
		//��s1��ΪStringBuffer�࣬ʹ����reverse������ת����תΪString����
		String s2 = new StringBuffer(s1).reverse().toString();
		if (s1.equals(s2)) {
			return true;
		}else {
			return false;
		}
		
	}

}
