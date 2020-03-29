package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1072. Êý×Ö¼ÓÃÜ
public class Main7_z_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char[] cArr = string.toCharArray();
		for (int i = 0; i < cArr.length; i++) {
			if ('a'<=cArr[i]&&cArr[i]<='w') {
				cArr[i] = (char)(cArr[i]+3);
			}else if('x'<=cArr[i]&&cArr[i]<='z'){
				cArr[i] = (char)(97+(cArr[i]%120));
			}else if('A'<=cArr[i]&&cArr[i]<='W'){
				cArr[i] = (char)(cArr[i]+3);
			}else if('X'<=cArr[i]&&cArr[i]<='Z'){
				cArr[i] = (char)(65+(cArr[i]%'X'));
			}
			System.out.print(cArr[i]);
		}
	}

}
