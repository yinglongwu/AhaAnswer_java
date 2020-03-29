package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1079. 3的倍数
public class Main3_3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		//方法一、类型转换
//		String s = Integer.toString(x);	//int转String
		//从String中取出区间（a，b）不包括b中对应的字符
//		String s0 = s.substring(0, 1);
//		String s1 = s.substring(1, 2);
//		String s2 = s.substring(2, 3);
		//String转int，求和
//		int sum = Integer.parseInt(s0)+Integer.parseInt(s1)+Integer.parseInt(s2);
		
		//方法二、数学计算
		int a = x/100;
		int b = (x-a*100)/10;
		int c = x%10;
		int sum = a+b+c;
		
		//判断
		if (sum%3==0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		scanner.close();
	}

}
