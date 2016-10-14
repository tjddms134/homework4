package homework4;

import java.util.Scanner;

public class GuGuDan {

	GuGuDan() {
	}

	void guguCalc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력을 원하는 단을 입력하세요 (Q종료): ");
		int r = sc.nextInt();
		if(r<=1&&r>=10){
			System.out.println("잘못입력");
		}
		for (int i = 1; i < 10; i++) {
			int result = r * i;
			System.out.println(r + "*" + i + "=" + result);
		}

	}
}