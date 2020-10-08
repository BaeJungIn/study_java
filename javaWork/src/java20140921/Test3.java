package java20140921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int [] a =new int[3];
		String score;
		int sum=0;
		double avg;
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 점수를 입력하시오 : ");
		a[0] = Integer.parseInt(br.readLine());

		System.out.print("영어 점수를 입력하시오 : ");
		a[1] = Integer.parseInt(br.readLine());

		System.out.print("수학 점수를 입력하시오 : ");
		a[2] = Integer.parseInt(br.readLine());
		
		System.out.print("국어  \t");
		System.out.print("영어  \t");
		System.out.println("수학  \t");
		
		for(int i=0; i<a.length; i++){
			switch(a[i]/5){
			case 20:
			case 19:
				System.out.print("A+ \t"); break;
			case 18:
				System.out.print("A0 \t"); break;
			case 17:
				System.out.print("B+ \t"); break;
			case 16:
				System.out.print("B0 \t"); break;
			case 15:
				System.out.print("C+ \t"); break;
			case 14:
				System.out.print("C0 \t"); break;
			case 13:
				System.out.print("D+ \t"); break;
			case 12:
				System.out.print("D0 \t"); break;
			
			default :
				System.out.print("F \t"); break;
				
			}
			sum += a[i];
			
				
		}
		avg = (double)(sum)/3;
		System.out.println();
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
	    
		
		
	}

}
