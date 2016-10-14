package homework4;
import java.util.Scanner;
public class GuGuDan2 {
	 GuGuDan2(){}
	   
	   void guguCalc(){
	      String s;
	      System.out.println("짝수단 홀수단 출력을 원하는 단을 고르시오");
	      Scanner sc = new Scanner(System.in);
	      
	      while(true){
	         System.out.print("E:짝수단, O:홀수단 (Q : 종료) ");
	         s = sc.nextLine();
	         
	         if(s.equals("E")){
	            for(int i=1; i<10; ++i){
	               for(int j=2; j<10; j+=2)
	                  System.out.printf("%d * %d = %d    ", j , i , j*i);
	               System.out.println();
	            }
	         }
	         else if(s.equals("O")){
	            for(int i=1; i<10; ++i){
	               for(int j=3; j<10; j+=2)
	                  System.out.printf("%d * %d = %d    ", j, i, j*i);
	               System.out.println();
	            }
	         }
	         else if(s.equals("Q"))
	            break;
	      }
	   }

}
