package bji20140921;


public abstract class Shape {   // p. 209의 예제 코드
	   protected int x, y, width, height;  //밑변, 높이 
	   public void setX(int newX) { //getter
	      x = newX;                     }
	   public void setY(int newY) { //setter
	      y = newY;                     }
	   public void setWidth(int newWidth) {  //setter
	      width = newWidth;                     }
	   public void setHeight(int newHeight) {  //setter
	      height = newHeight;                     }
	   public abstract float getArea(); //추상 메소드
	}

	