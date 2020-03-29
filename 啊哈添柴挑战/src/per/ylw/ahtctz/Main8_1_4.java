package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1814. ���Թ�4-�ж��յ�
public class Main8_1_4 {

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
			case 'w'://�����ƶ�
				if (map[Ox-1][Oy]!='#') {
					map[Ox][Oy] = ' ';
					map[Ox-1][Oy] = 'O';
					Ox = Ox-1;
				}
				break;
			case 'a'://�����ƶ�
				if (map[Ox][Oy-1]!='#') {
					map[Ox][Oy] = ' ';
					map[Ox][Oy-1] = 'O';
					Oy = Oy-1;
				}
				break;
			case 's'://�����ƶ�
				if (map[Ox+1][Oy]!='#') {
					map[Ox][Oy] = ' ';
					map[Ox+1][Oy] = 'O';
					Ox = Ox+1;
				}
				break;
			case 'd'://�����ƶ�
				if (map[Ox][Oy+1]!='#') {
					map[Ox][Oy] = ' ';
					map[Ox][Oy+1] = 'O';
					Oy = Oy+1;
				}
				break;
			default:
				break;
			}
		}
		
		if (Ox==1 && Oy==5) {
			System.out.println("You Win!");//ע��Ӣ���̾��
		}else {
			for (int i = 0; i < map.length; i++) {
				System.out.println(map[i]);
			}
		}
	}

}
