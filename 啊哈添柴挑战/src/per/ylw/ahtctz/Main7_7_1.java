package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1055. ×Ö·ûÍ³¼Æ
public class Main7_7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count1=0,count2=0,count3=0;
		String s = scanner.next();
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i+1).matches("[a-z]")) {
				count1++;
			}
			if (s.substring(i, i+1).matches("[A-Z]")) {
				count2++;
			}
			if (s.substring(i, i+1).matches("[0-9]")) {
				count3++;
			}
		}
		System.out.println(count1+" "+count2+" "+count3);
	}

}
