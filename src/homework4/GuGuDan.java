package homework4;

import java.util.Scanner;

public class GuGuDan {

	GuGuDan() {
	}

	void guguCalc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���ϴ� ���� �Է��ϼ��� (Q����): ");
		int r = sc.nextInt();
		if(r<=1&&r>=10){
			System.out.println("�߸��Է�");
		}
		for (int i = 1; i < 10; i++) {
			int result = r * i;
			System.out.println(r + "*" + i + "=" + result);
		}

	}
}