package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1822. ������2-�����ƣ�
public class Main8_2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[][] map = new char[][]{
			{' ',' ',' ','#','#','#'},
			{' ',' ',' ','#','*','#'},
			{' ',' ',' ','#',' ','#'},
			{'#','#','#','#','O','#','#','#','#','#','#'},
			{'#','*',' ',' ','O','S',' ','O',' ','*','#'},
			{'#','#','#','#','#','O','#','#','#','#','#'},
			{' ',' ',' ',' ','#',' ','#'},
			{' ',' ',' ',' ','#','*','#'},
			{' ',' ',' ',' ','#','#','#'},
		};
		int Sx=4,Sy=5;
		int n = scanner.nextInt();
		String step = scanner.next();
		char[] stepArr = step.toCharArray();
		for (int i = 0; i < stepArr.length; i++) {
			switch (stepArr[i]) {
			case 'd'://С��S�����ƶ�
				if (map[Sx][Sy+1]==' ') {//����ұ�Ϊ�գ�ֱ����
					map[Sx][Sy]=' ';
					map[Sx][Sy+1]='S';
					Sy = Sy+1;
				}else if (map[Sx][Sy+1]=='O') {//����ұ�������
					if (map[Sx][Sy+2]==' ') {//��������ұ�Ϊ��
						map[Sx][Sy]=' ';
						map[Sx][Sy+1]='S';
						map[Sx][Sy+2]='O';
						Sy = Sy+1;
					}else if (map[Sx][Sy+2]=='*') {//��������ұ���Ҫ�����λ��
						map[Sx][Sy]=' ';
						map[Sx][Sy+1]='S';
						map[Sx][Sy+2]='@';
						Sy = Sy+1;
					}
				}
				break;

			default:
				break;
			}
		}
		
		for (int i = 0; i < map.length; i++) {
			System.out.println(map[i]);
		}
	}

}
