package bji20140921;


public class RegionMatches {
public static void main(String[] args) {
   
   
   String a = "Java Programming Very Good";
   String b = "java Programming ";
   
   boolean x = a.regionMatches(5, b, 5, 11);
   boolean y = a.regionMatches(true, 0, b, 0, 4);
   boolean z = a.regionMatches(false, 0, b, 0, 4);
   
   System.out.println("[regoinMathces() �޼ҵ�� �κ� ���ڿ� ��]");
   System.out.println("�κ� ���ڿ��� �� ��� : "+x);
   System.out.println("��ҹ��� ���о��� �κй��ڿ��� �� ��� : "+y);
   System.out.println("��ҹ��� �����Ͽ� �κй��ڿ��� �� ��� : "+z);
   
  /* System.out.println("��ҹ��� ���о��� �κй��ڿ��� �� ��� : "+a.regionMatches(true, 0, b, 0, 4));
   System.out.println("��ҹ��� �����Ͽ� �κй��ڿ��� �� ��� : "+a.regionMatches(false, 0, b, 0, 4));*/
   
}
}