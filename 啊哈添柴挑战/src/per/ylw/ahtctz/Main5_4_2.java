package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1050. 最大公约数
public class Main5_4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		BigInteger x = scanner.nextBigInteger();
//		BigInteger y = scanner.nextBigInteger();
//		int a = 10;
//		BigInteger b = BigInteger.valueOf(a);
//
//		BigInteger gcd = x.gcd(y);	//BigInteger自带的求最大公约数的方法
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println(gcd(x,y));
		scanner.close();
	}
	
	public static int gcd (int a,int b) {
        if (a==b) {
			return a;
		} else if (a>b) {
			a = a-b;
		} else {
			b = b-a;
		}
        return gcd(a, b);
        
	}

}
