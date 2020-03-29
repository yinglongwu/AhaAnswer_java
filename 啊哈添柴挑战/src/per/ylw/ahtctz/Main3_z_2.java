package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1023. ÅÐ¶ÏÄÜ·ñ±»3£¬5£¬7Õû³ý
public class Main3_z_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if (a%3==0 && a%5==0 && a%7==0) {
			System.out.println(3+" "+5+" "+7);
		} else if(a%3==0 || a%5==0 || a%7==0){
			if (a%3==0) {
				System.out.print(3+" ");
			}
			if (a%5==0) {
				System.out.print(5+" ");
			}
			if (a%7==0) {
				System.out.print(7+" ");
			}
			
		} else {
			System.out.println("n");
		}
		
		scanner.close();
	}

}
