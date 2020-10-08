package bji20140921;

public class ShapeTest {
	   public static void main(String args[]){
	      Rectangle r = new Rectangle();
	      Triangle t = new Triangle();
	      r.setWidth(10); //메소드 사용하여 폭 입력
	      r.setHeight(10);  //메소드 사용하여 높이 입력 
	      System.out.println("사각형 넓이 : " + r.getArea() );

	      t.setX(10); //메소드 사용하여 폭 입력
	      t.setY(10); //메소드 사용하여 높이 입력 
	      System.out.println("삼각형 넓이 : " + t.getArea() );
	   }
	}