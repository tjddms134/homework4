package homework4;
import java.util.Scanner;
public class SumAndAvg {
	 int sum=0;
	   int avg=0;
	   int cnt=0;
	   String num;
	   SumAndAvg(){}
	   
	   void Sum(){
	      System.out.println("�Է¹��������� �հ�� ���");
	   
	      while(true){
	         Scanner sc = new Scanner(System.in);
	         
	         System.out.print("���ڸ� �Է��ϼ��� (Q : ����) ");
	         num = sc.nextLine();
	         if(num.equals("Q"))
	            break;
	         sum+=Integer.parseInt(num);
	         ++cnt;
	      }
	      System.out.printf("�հ�� %d�̰�, �����  %.2f�Դϴ�.\n",sum,Avg());
	   }
	   float Avg(){
	      return (float)sum/cnt;
	   }


}
