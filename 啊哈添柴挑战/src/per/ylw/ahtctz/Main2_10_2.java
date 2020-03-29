package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1292. 另一种交换两个数的方法
public class Main2_10_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
	    a=b-a;
	    b=b-a;
	    a=b+a;
	    
	    System.out.println(a+" "+b);
	    scanner.close();
	}

}
