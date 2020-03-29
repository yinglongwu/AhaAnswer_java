package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1771. ×ÖµäÐò
public class Main7_7_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] sArr = new String[n];

		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = scanner.next();
		}
		
		//Ã°ÅÝÅÅÐò
		for (int i = 0; i < sArr.length-1; i++) {
			for (int j = 0; j < sArr.length-1-i; j++) {
				if (sArr[j].compareTo(sArr[j+1])>0) {
					String temp = sArr[j];
					sArr[j] = sArr[j+1];
					sArr[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}

}
