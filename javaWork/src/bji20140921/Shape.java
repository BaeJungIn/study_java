package bji20140921;


public abstract class Shape {   // p. 209�� ���� �ڵ�
	   protected int x, y, width, height;  //�غ�, ���� 
	   public void setX(int newX) { //getter
	      x = newX;                     }
	   public void setY(int newY) { //setter
	      y = newY;                     }
	   public void setWidth(int newWidth) {  //setter
	      width = newWidth;                     }
	   public void setHeight(int newHeight) {  //setter
	      height = newHeight;                     }
	   public abstract float getArea(); //�߻� �޼ҵ�
	}

	