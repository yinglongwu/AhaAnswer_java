package per.ylw.ahtctz;

/**
 * @author yinglongwu
 */
//1583. 填数游戏（提高版）
public class Main5_8_3 {

	public static void main(String[] args) {
		for (int a = 1; a < 7; a++) {
			for (int b = 1; b < 7; b++) {
				for (int c = 1; c < 7; c++) {
					for (int d = 1; d < 7; d++) {
						for (int e = 1; e < 7; e++) {
							for (int f = 1; f < 7; f++) {
								if (a==b||a==c||a==d||a==e||a==f||b==c||b==d||b==e||b==f||c==d||c==e||c==f||d==e||d==f||e==f) {
									continue;
								} else {
									if (a+b+c==a+f+e&&a+b+c==c+d+e&&a+f+e==c+d+e) {
										System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
									}
								}
							}
						}
					}
				}
			}
		}
	}

}
