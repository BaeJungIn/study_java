package bji20140921;


public class Circle2 extends Point {  //P. 175 Point Ŭ���� ���
	   int radius;              
	   double r = 3.14;                //p.177 Circle Ŭ���� ����Ͽ� ���� 
	   Circle2() { 
		  x= 5 ;
		  y= 5 ;
		  radius = 5;
	   } //������
	   Circle2(int a, int b,  int c) { 
		   x = a;
		   y = b;
		   radius = c;
	   } //������
	   public int getRadius() {
		   return radius;
	   }  //getter
	   public String showCircle() {
		   return "Center =" + "(" + x + "," + y + ")" + ", Radius = " + radius;
	   } //���� x, y, radius ���
	   public int area() { //���� ���� ���
	      return (int) (radius*radius*r);
	   }

	   public static void main(String args[]) { 
	     Circle2 myCircle = new Circle2( ); 
	     
	     System.out.println("The x of MyCircle is " + myCircle.getX() + "."); 
	     System.out.println("The y of MyCircle is " + myCircle.getY() + ".");
	     System.out.println("The radius of MyCircle is " + myCircle.getRadius() + "."); 
	     System.out.println("MyCircle : " + myCircle.showCircle() + "."); 

	      //���� ���� ���
	      myCircle.area();
	      System.out.println("���� ���� (������*������*3.14), (int�� ��ȯ) : " + myCircle.area());
	   }
	}

