package per.ylw.ahtctz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1752. ×Ö·ûµÄÅÅÐò
public class Main7_5_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char[] cArr = string.toCharArray();
		Arrays.sort(cArr);
		for (int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i]);
		}
	}

}
