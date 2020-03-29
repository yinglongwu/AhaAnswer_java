package per.ylw.ahtctz;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1051. 最小公倍数
public class Main5_4_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger x = scanner.nextBigInteger();
		BigInteger y = scanner.nextBigInteger();

		System.out.println(lcm(x, y));
		scanner.close();
	}
	
	public static int lcm (BigInteger a,BigInteger b) {
		//BigInteger自带的求最大公约数的方法
		//intValue();BigInteger类自带转为int型的方法
		int gcd = (a.gcd(b)).intValue();
		int x = a.intValue();
		int y = b.intValue();
		
		int lcm = (x*y)/gcd;//最大公约数×最小公倍数=原来两个数的乘积
		
		return lcm;
	}

}
