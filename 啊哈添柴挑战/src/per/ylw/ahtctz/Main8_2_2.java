package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1822. 推箱子2-向右推！
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
