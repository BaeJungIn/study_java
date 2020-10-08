package java20140921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
 public static void main(String args[]) throws IOException{
	 
	 int inputNum=0; //정수 입력받을 변수 설정

	 BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); //버퍼리더로 입력받음
	 System.out.print("높이(정수)를 입력하세요! : ");
	 inputNum =Integer.parseInt(inbr.readLine()); 
	 
	 int temp=inputNum; //temp에 inputNum 저장
	
		 for (int i = 1; i <=inputNum; i++) { //행을 나타내는 반복문, i가 1로 시작하여 입력받은 수보다 작거나 같을때까지 1씩 증가하여 실행
			 for (int j = inputNum; j >=i; j--) { //열을 나타내는 반복문, j가 입력받은 수로 시작하여 i보다 크거나 같을때가지 1씩 감소하여 실행
     			
				 --temp; //temp 선감소
				 System.out.print((inputNum-i)*temp+"\t"); //입력받은 정수에 i만큼 감소시킨 수와 입력받은 정수(1씩 감소하는)를 곱하여 출력
			 }
			 System.out.println();  
			 temp=inputNum-i; //입력받은 정수에서 i만큼 감소시킨 값을 temp에 저장
     		}
	 }
   }
