package per.ylw.ahtctz;

import java.util.Scanner;
/**
 * @author yinglongwu
 */
//1078. 判断3的倍数
public class Main3_3_1 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//这里抓一下异常
		//测试数据里有超int的数，但是还不能用long接收
		//这里题目的意思应该是超出范围就输出no
		try {	
			int x = scanner.nextInt();
			if (x%3==0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} catch (Exception e) {
			System.out.println("no");
		} finally {
			scanner.close();
		}
	}

}
