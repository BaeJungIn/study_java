package bji20140921;


public class RegionMatches {
public static void main(String[] args) {
   
   
   String a = "Java Programming Very Good";
   String b = "java Programming ";
   
   boolean x = a.regionMatches(5, b, 5, 11);
   boolean y = a.regionMatches(true, 0, b, 0, 4);
   boolean z = a.regionMatches(false, 0, b, 0, 4);
   
   System.out.println("[regoinMathces() 메소드로 부분 문자열 비교]");
   System.out.println("부분 문자열의 비교 결과 : "+x);
   System.out.println("대소문자 구분없이 부분문자열의 비교 결과 : "+y);
   System.out.println("대소문자 구분하여 부분문자열의 비교 결과 : "+z);
   
  /* System.out.println("대소문자 구분없이 부분문자열의 비교 결과 : "+a.regionMatches(true, 0, b, 0, 4));
   System.out.println("대소문자 구분하여 부분문자열의 비교 결과 : "+a.regionMatches(false, 0, b, 0, 4));*/
   
}
}