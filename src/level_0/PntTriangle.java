package level_0;

import java.util.Scanner;

public class PntTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ﰢ���� ���̸� �Է��ϼ��� : ");
		
		int n = sc.nextInt();
		
		for(int i = 1;i <= n;i++) {
			for(int j = 0;j < i ;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

}
