package bji20140921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test4_6 {
public static void main(String[] args) throws IOException{
   int tokencnt=0;
   System.out.println("**입력없이 엔터키를 치면 종료 ***");
   
   BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
   
   do{
      System.out.println("문자열 입력 : ");
      
      String instr = inbr.readLine();
      StringTokenizer str = new StringTokenizer(instr);
      tokencnt = str.countTokens();
      System.out.println("파싱할 문자열의 수는 총 "+ tokencnt);
      
      while(str.hasMoreTokens()){
         System.out.println("   [ " + (str.nextToken()) + " ]");
         }
      System.out.println();
   }while(tokencnt !=0);
}
}