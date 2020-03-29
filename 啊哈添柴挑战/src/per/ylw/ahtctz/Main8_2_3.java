package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1823. ������3-������
public class Main8_2_3 {

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
			case 'w'://С��S�����ƶ�
				if (map[Sx-1][Sy]==' ') {//����ϱ�Ϊ�գ�ֱ����
					map[Sx][Sy]=' ';
					map[Sx-1][Sy]='S';
					Sx = Sx-1;
				}else if (map[Sx-1][Sy]=='O') {//����ϱ�������
					if (map[Sx-2][Sy]==' ') {//��������ϱ�Ϊ��
						map[Sx][Sy]=' ';
						map[Sx-1][Sy]='S';
						map[Sx-2][Sy]='O';
						Sx = Sx-1;
					}else if (map[Sx-2][Sy]=='*') {//��������ϱ���Ҫ�����λ��
						map[Sx][Sy]=' ';
						map[Sx-1][Sy]='S';
						map[Sx-2][Sy]='@';
						Sx = Sx-1;
					}
				}
				break;
			case 'a'://С��S�����ƶ�
				if (map[Sx][Sy-1]==' ') {//������Ϊ�գ�ֱ����
					map[Sx][Sy]=' ';
					map[Sx][Sy-1]='S';
					Sy = Sy-1;
				}else if (map[Sx][Sy-1]=='O') {//������������
					if (map[Sx][Sy-2]==' ') {//����������Ϊ��
						map[Sx][Sy]=' ';
						map[Sx][Sy-1]='S';
						map[Sx][Sy-2]='O';
						Sy = Sy-1;
					}else if (map[Sx][Sy-2]=='*') {//������������Ҫ�����λ��
						map[Sx][Sy]=' ';
						map[Sx][Sy-1]='S';
						map[Sx][Sy-2]='@';
						Sy = Sy-1;
					}
				}
				break;
			case 's'://С��S�����ƶ�
				if (map[Sx+1][Sy]==' ') {//����±�Ϊ�գ�ֱ����
					map[Sx][Sy]=' ';
					map[Sx+1][Sy]='S';
					Sx = Sx+1;
				}else if (map[Sx+1][Sy]=='O') {//����±�������
					if (map[Sx+2][Sy]==' ') {//��������±�Ϊ��
						map[Sx][Sy]=' ';
						map[Sx+1][Sy]='S';
						map[Sx+2][Sy]='O';
						Sx = Sx+1;
					}else if (map[Sx+2][Sy]=='*') {//��������±���Ҫ�����λ��
						map[Sx][Sy]=' ';
						map[Sx+1][Sy]='S';
						map[Sx+2][Sy]='@';
						Sx = Sx+1;
					}
				}
				break;	
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