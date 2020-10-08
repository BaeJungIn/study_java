package bji20140921;


public class Circle2 extends Point {  //P. 175 Point 클래스 사용
	   int radius;              
	   double r = 3.14;                //p.177 Circle 클래스 사용하여 수정 
	   Circle2() { 
		  x= 5 ;
		  y= 5 ;
		  radius = 5;
	   } //생성자
	   Circle2(int a, int b,  int c) { 
		   x = a;
		   y = b;
		   radius = c;
	   } //생성자
	   public int getRadius() {
		   return radius;
	   }  //getter
	   public String showCircle() {
		   return "Center =" + "(" + x + "," + y + ")" + ", Radius = " + radius;
	   } //변수 x, y, radius 출력
	   public int area() { //원의 넓이 계산
	      return (int) (radius*radius*r);
	   }

	   public static void main(String args[]) { 
	     Circle2 myCircle = new Circle2( ); 
	     
	     System.out.println("The x of MyCircle is " + myCircle.getX() + "."); 
	     System.out.println("The y of MyCircle is " + myCircle.getY() + ".");
	     System.out.println("The radius of MyCircle is " + myCircle.getRadius() + "."); 
	     System.out.println("MyCircle : " + myCircle.showCircle() + "."); 

	      //원의 넓이 출력
	      myCircle.area();
	      System.out.println("원의 넓이 (반지름*반지름*3.14), (int로 변환) : " + myCircle.area());
	   }
	}

