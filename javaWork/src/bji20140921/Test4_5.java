package bji20140921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("����� ���ڿ��� �Է��ϼ���! : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr); //���ۿ���
		String instr = inbr.readLine();
		//StringBuffere�� ���� ����
		StringBuffer str = new StringBuffer(instr);
		
		System.out.println("�Է��� ���ڿ� : "+str);
		
		//���ڿ��� �Ųٷ� �ٲ۴�
		System.out.println("�Ųٷ� �ٲ� ���ڿ� : "+str.reverse());
	}

}
