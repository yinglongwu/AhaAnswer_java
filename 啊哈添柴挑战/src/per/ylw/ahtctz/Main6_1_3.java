package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1611. 反向输出练习（难）
public class Main6_1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//int转String然后这个String用来new StringBuffer
		StringBuffer sBuffer = new StringBuffer(Integer.toString(n));
		//reverse方法实现StringBuffer反转,StringBuffer转String再转int，实现消除前面的0
		System.out.println(Integer.parseInt(sBuffer.reverse().toString()));
		scanner.close();
	}

}
