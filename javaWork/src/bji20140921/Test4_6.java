package bji20140921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test4_6 {
public static void main(String[] args) throws IOException{
   int tokencnt=0;
   System.out.println("**�Է¾��� ����Ű�� ġ�� ���� ***");
   
   BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
   
   do{
      System.out.println("���ڿ� �Է� : ");
      
      String instr = inbr.readLine();
      StringTokenizer str = new StringTokenizer(instr);
      tokencnt = str.countTokens();
      System.out.println("�Ľ��� ���ڿ��� ���� �� "+ tokencnt);
      
      while(str.hasMoreTokens()){
         System.out.println("   [ " + (str.nextToken()) + " ]");
         }
      System.out.println();
   }while(tokencnt !=0);
}
}