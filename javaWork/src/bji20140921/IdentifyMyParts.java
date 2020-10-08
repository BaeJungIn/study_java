package bji20140921;

public class IdentifyMyParts{
	public static int x = 7;
	public int y = 3; 
	
   public static void main(String[] args) {
	    
      IdentifyMyParts a = new IdentifyMyParts();
      IdentifyMyParts b = new IdentifyMyParts();
      a.y = 5;
      b.y = 6;
      a.x = 1;
      b.x = 2;
      System.out.println("a.y = " + a.y);
      System.out.println("b.y = " + b.y);
      System.out.println("a.x = " + a.x);
      System.out.println("b.x = " + b.x);
      System.out.println("IdentifyMyParts.x = "+IdentifyMyParts.x);
   }
}

//클래스 변수 -> x
//인스턴스 변수 -> y
//출력 결과

/*a.y = 5
 *b.y = 6
 *a.x = 2
 *b.x = 2
 *IdentifyMyParts.x = 2
 */
//y는 지역변수(인스턴스변수) 이기 때문에 값을설정하면 계속 바뀜
//x는 클래스변수 이므로 객체를 여러개 생성해도 하나의 저장공간을 공유함
//따라서 마지막에 바뀐 x가 x의 최종값이 됨 (b.x=2)