package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1772. �����Ǽ�
public class Main7_7_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] sArr = new String[2*n];

		//ֱ�ӵ�������
		for (int i = 0; i < sArr.length; i=i+2) {
			sArr[i+1] = scanner.next();
			sArr[i] = scanner.next();
		}
		
		for (int i = 0; i < sArr.length; i=i+2) {
			System.out.println(sArr[i]+" "+sArr[i+1]);
		}
	}

}
