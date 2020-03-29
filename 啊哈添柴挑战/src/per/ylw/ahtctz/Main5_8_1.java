package per.ylw.ahtctz;

/**
 * @author yinglongwu
 */
//1581. 填数游戏（入门版）
public class Main5_8_1 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if ((i*10+3)*6528==(30+i)*8256) {
				System.out.println(i);
			}
		}
	}

}
