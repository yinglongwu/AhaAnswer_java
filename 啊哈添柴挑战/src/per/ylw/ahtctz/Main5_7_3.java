package per.ylw.ahtctz;

/**
 * @author yinglongwu
 */
//1573. Ë®ÏÉ»¨Êý
public class Main5_7_3 {

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int ge = i%10;
			int shi = (i%100)/10;
			int bai = i/100;
			
			if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i) {
				System.out.println(i);				
			}
		}
	}

}
