package homework4;
import java.util.Scanner;
public class ExamForWhile {
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	         System.out.println("===================");
	         System.out.println("�޴��� �������ּ��� ");
	         System.out.println("===================");
	         System.out.println("1. 1���� �Է��� ������ ���ϱ�");
	         System.out.println("2. �ִ밪/�ּҰ����ϱ�");
	         System.out.println("3. �Է¹��� ������ �հ�� ��ձ��ϱ�");
	         System.out.println("4. ���ϴ� ������ ����ϱ�");
	         System.out.println("5. ¦����/Ȧ���� ����ϱ�");
	         System.out.println("6. �����ϱ�");
	         
	         int select = sc.nextInt();

	         if (select == 1) {
	            SumOfNumbers sumNum = new SumOfNumbers();
	            sumNum.Sum();
	         } else if (select == 2) {
	            MaxAndMin maxmin = new MaxAndMin();
	            maxmin.MaxMin();
	         } else if (select == 3) {
	            SumAndAvg sumAvg = new SumAndAvg();
	            sumAvg.Sum();
	            sumAvg.Avg();
	         } else if (select == 4) {
	            GuGuDan gugu = new GuGuDan();
	            gugu.guguCalc();
	         } else if (select == 5) {
	            GuGuDan2 gugu2 = new GuGuDan2();
	            gugu2.guguCalc();
	         } else if (select == 6)
	            return;
	   }
}
