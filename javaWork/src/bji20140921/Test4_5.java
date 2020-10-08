package bji20140921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("출력할 문자열을 입력하세요! : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr); //버퍼연결
		String instr = inbr.readLine();
		//StringBuffere형 변수 생성
		StringBuffer str = new StringBuffer(instr);
		
		System.out.println("입력한 문자열 : "+str);
		
		//문자열을 거꾸로 바꾼다
		System.out.println("거꾸로 바뀐 문자열 : "+str.reverse());
	}

}
