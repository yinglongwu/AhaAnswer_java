package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1016. 反向输出一个三位数
public class Main6_1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//int转String然后这个String用来new StringBuffer
		StringBuffer sBuffer = new StringBuffer(Integer.toString(n));
		System.out.println(sBuffer.reverse());//reverse方法实现StringBuffer反转
		scanner.close();
	}

}
