package per.ylw.ahtctz;

import java.util.Scanner;
/**
 * @author yinglongwu
 */
//1078. �ж�3�ı���
public class Main3_3_1 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//����ץһ���쳣
		//�����������г�int���������ǻ�������long����
		//������Ŀ����˼Ӧ���ǳ�����Χ�����no
		try {	
			int x = scanner.nextInt();
			if (x%3==0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} catch (Exception e) {
			System.out.println("no");
		} finally {
			scanner.close();
		}
	}

}
