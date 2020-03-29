package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1087. 下一个字母
public class Main2_8_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//java里没有nextchar()，这里的意思是字符串里的第一个元素
		char ch = scanner.next().charAt(0);
		
		//ch+1的结果是ASCII码，要强转成char
		System.out.println((char)(ch+1));
		scanner.close();
	}

}
