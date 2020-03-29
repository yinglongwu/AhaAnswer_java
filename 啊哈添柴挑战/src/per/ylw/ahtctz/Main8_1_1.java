package per.ylw.ahtctz;

/**
 * @author yinglongwu
 */
//1811. 走迷宫1-储存迷宫
public class Main8_1_1 {

	public static void main(String[] args) {
		char[][] map = new char[][]{
			{'#','#','#','#','#','#'},
			{'#','O',' ','#',' ','E'},
			{'#',' ','#','#',' ','#'},
			{'#',' ',' ','#',' ','#'},
			{'#','#',' ',' ',' ','#'},
			{'#','#','#','#','#','#'},
		};
		//char类型数组的输出比较神奇,可以直接用数组名打印
		for (int i = 0; i < map.length; i++) {
			System.out.println(map[i]);

		}
		
	}

}
