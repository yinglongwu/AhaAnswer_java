package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1812. ���Թ�2-�����ƶ�
public class Main8_1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char[][] map = new char[][]{
			{'#','#','#','#','#','#'},
			{'#','O',' ','#',' ','E'},
			{'#',' ','#','#',' ','#'},
			{'#',' ',' ','#',' ','#'},
			{'#','#',' ',' ',' ','#'},
			{'#','#','#','#','#','#'},
		};
		int Ox = 1,Oy = 1;
		String step = scanner.next();
		char[] stepArr = step.toCharArray();
		for (int i = 0; i < stepArr.length; i++) {
			switch (stepArr[i]) {
			case 's'://�����ƶ�
				if (map[Ox+1][Oy]!='#') {
					map[Ox][Oy] = ' ';
					map[Ox+1][Oy] = 'O';
					Ox = Ox+1;
				}
				break;

			default:
				break;
			}
		}
		
		//char�������������Ƚ�����,����ֱ������������ӡ
		for (int i = 0; i < map.length; i++) {
			System.out.println(map[i]);
		}
	}

}
