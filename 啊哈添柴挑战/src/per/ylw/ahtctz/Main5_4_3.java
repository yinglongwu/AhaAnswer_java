package per.ylw.ahtctz;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1051. ��С������
public class Main5_4_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger x = scanner.nextBigInteger();
		BigInteger y = scanner.nextBigInteger();

		System.out.println(lcm(x, y));
		scanner.close();
	}
	
	public static int lcm (BigInteger a,BigInteger b) {
		//BigInteger�Դ��������Լ���ķ���
		//intValue();BigInteger���Դ�תΪint�͵ķ���
		int gcd = (a.gcd(b)).intValue();
		int x = a.intValue();
		int y = b.intValue();
		
		int lcm = (x*y)/gcd;//���Լ������С������=ԭ���������ĳ˻�
		
		return lcm;
	}

}
