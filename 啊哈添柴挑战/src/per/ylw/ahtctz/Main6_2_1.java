package per.ylw.ahtctz;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1035. 求均值
public class Main6_2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(average(arr));
		scanner.close();
	}
	
	//求数组平均值,四舍五入保留小数点后两位
	public static BigDecimal average(int[] iArr) {
		double sum = 0.00;
		for (int i = 0; i < iArr.length; i++) {
			sum = sum + iArr[i];
		}
		double dAverage = sum/(iArr.length);
		BigDecimal bd = new BigDecimal(dAverage);
		BigDecimal result = bd.setScale(2, RoundingMode.HALF_UP);
		return result;
	}
	
}
