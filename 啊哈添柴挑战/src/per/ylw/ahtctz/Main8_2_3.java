package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1823. 推箱子3-四向推
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
			case 'w'://小人S向上移动
				if (map[Sx-1][Sy]==' ') {//如果上边为空，直接走
					map[Sx][Sy]=' ';
					map[Sx-1][Sy]='S';
					Sx = Sx-1;
				}else if (map[Sx-1][Sy]=='O') {//如果上边是箱子
					if (map[Sx-2][Sy]==' ') {//如果箱子上边为空
						map[Sx][Sy]=' ';
						map[Sx-1][Sy]='S';
						map[Sx-2][Sy]='O';
						Sx = Sx-1;
					}else if (map[Sx-2][Sy]=='*') {//如果箱子上边是要到达的位置
						map[Sx][Sy]=' ';
						map[Sx-1][Sy]='S';
						map[Sx-2][Sy]='@';
						Sx = Sx-1;
					}
				}
				break;
			case 'a'://小人S向左移动
				if (map[Sx][Sy-1]==' ') {//如果左边为空，直接走
					map[Sx][Sy]=' ';
					map[Sx][Sy-1]='S';
					Sy = Sy-1;
				}else if (map[Sx][Sy-1]=='O') {//如果左边是箱子
					if (map[Sx][Sy-2]==' ') {//如果箱子左边为空
						map[Sx][Sy]=' ';
						map[Sx][Sy-1]='S';
						map[Sx][Sy-2]='O';
						Sy = Sy-1;
					}else if (map[Sx][Sy-2]=='*') {//如果箱子左边是要到达的位置
						map[Sx][Sy]=' ';
						map[Sx][Sy-1]='S';
						map[Sx][Sy-2]='@';
						Sy = Sy-1;
					}
				}
				break;
			case 's'://小人S向下移动
				if (map[Sx+1][Sy]==' ') {//如果下边为空，直接走
					map[Sx][Sy]=' ';
					map[Sx+1][Sy]='S';
					Sx = Sx+1;
				}else if (map[Sx+1][Sy]=='O') {//如果下边是箱子
					if (map[Sx+2][Sy]==' ') {//如果箱子下边为空
						map[Sx][Sy]=' ';
						map[Sx+1][Sy]='S';
						map[Sx+2][Sy]='O';
						Sx = Sx+1;
					}else if (map[Sx+2][Sy]=='*') {//如果箱子下边是要到达的位置
						map[Sx][Sy]=' ';
						map[Sx+1][Sy]='S';
						map[Sx+2][Sy]='@';
						Sx = Sx+1;
					}
				}
				break;	
			case 'd'://小人S向右移动
				if (map[Sx][Sy+1]==' ') {//如果右边为空，直接走
					map[Sx][Sy]=' ';
					map[Sx][Sy+1]='S';
					Sy = Sy+1;
				}else if (map[Sx][Sy+1]=='O') {//如果右边是箱子
					if (map[Sx][Sy+2]==' ') {//如果箱子右边为空
						map[Sx][Sy]=' ';
						map[Sx][Sy+1]='S';
						map[Sx][Sy+2]='O';
						Sy = Sy+1;
					}else if (map[Sx][Sy+2]=='*') {//如果箱子右边是要到达的位置
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