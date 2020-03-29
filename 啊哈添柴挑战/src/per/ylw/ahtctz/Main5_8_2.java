package per.ylw.ahtctz;

/**
 * @author yinglongwu
 */
//1582. ÌîÊıÓÎÏ·£¨½ø½×°æ£©
public class Main5_8_2 {

	public static void main(String[] args) {
		for (int a = 1; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					for (int d = 1; d < 10; d++) {
						for (int e = 0; e < 10; e++) { 
							String s = Integer.toString(a)+Integer.toString(b)+Integer.toString(c)+Integer.toString(d)+Integer.toString(e);
							boolean repeat = false;
							afor:for (int i = 0; i < s.length()-1; i++) {
									for (int j = i+1; j < s.length(); j++) {
									if (s.substring(i, i+1).equals(s.substring(j, j+1))) {
										repeat=true;
										break afor;
									}
								}
							}
							if (repeat) {
								continue;
							}
							String s1 = Integer.toString(a)+Integer.toString(b)+Integer.toString(c)+Integer.toString(d);
							String s2 = Integer.toString(d)+Integer.toString(c)+Integer.toString(b)+Integer.toString(a);
							int num1 = Integer.parseInt(s1);
							int num2 = Integer.parseInt(s2);
							if (num1*e==num2) {
								System.out.println(a+" "+b+" "+c+" "+d+" "+e+" ");
							}
						}
					}
				}
			}
		}
	}

}
