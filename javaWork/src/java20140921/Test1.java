package java20140921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
 public static void main(String args[]) throws IOException{
	 
	 int inputNum=0; //���� �Է¹��� ���� ����

	 BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); //���۸����� �Է¹���
	 System.out.print("����(����)�� �Է��ϼ���! : ");
	 inputNum =Integer.parseInt(inbr.readLine()); 
	 
	 int temp=inputNum; //temp�� inputNum ����
	
		 for (int i = 1; i <=inputNum; i++) { //���� ��Ÿ���� �ݺ���, i�� 1�� �����Ͽ� �Է¹��� ������ �۰ų� ���������� 1�� �����Ͽ� ����
			 for (int j = inputNum; j >=i; j--) { //���� ��Ÿ���� �ݺ���, j�� �Է¹��� ���� �����Ͽ� i���� ũ�ų� ���������� 1�� �����Ͽ� ����
     			
				 --temp; //temp ������
				 System.out.print((inputNum-i)*temp+"\t"); //�Է¹��� ������ i��ŭ ���ҽ�Ų ���� �Է¹��� ����(1�� �����ϴ�)�� ���Ͽ� ���
			 }
			 System.out.println();  
			 temp=inputNum-i; //�Է¹��� �������� i��ŭ ���ҽ�Ų ���� temp�� ����
     		}
	 }
   }
