package homework4;
import java.util.Scanner;

public class SumOfNumbers {
	 int sum;
	   String num;
	   
	   SumOfNumbers(){}
	   void Sum(){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("1���� �Է��� ������ ���ϱ�");
	      
	      while (true) {
	         System.out.print("���ڸ� �Է����ּ��� (Q : ����)");
	         num = sc.nextLine();
	         
	         if(num.equals("Q"))
	            break;
	         else {
	            for (int i = 1; i <= Integer.parseInt(num); ++i)
	               sum += i;
	            System.out.printf("���� %d�Դϴ�.\n", sum);
	         }
	         sum=0;
	      }
	      return;
	   }

}
