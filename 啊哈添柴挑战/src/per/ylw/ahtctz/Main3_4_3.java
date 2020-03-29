package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1069. Ð´ÆÀÓï
public class Main3_4_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if (score>=90) {
			System.out.println("Excellent");
		} else if(score>=60){
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		scanner.close();
	}

}
