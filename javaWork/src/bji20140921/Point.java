package bji20140921;

public class Point {
	int x, y;
	Point(){
		x=0; y=0;
	}
	public int getX(){
		return x;
	}
	protected void setX(int a){
		x=a;
	}
	public int getY(){
		return y;
	}
	protected void setY(int b){
		y=b;
	}
	public void setPoint(int a, int b){
		x=a;
		y=b;
	}
	public String showPoint(){
		return "(" + x + "," + y + ")";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point MyPoint = new Point( );
		MyPoint.setPoint(10,20);

		System.out.println("The x of MyPoint is " + MyPoint.getX() + "."); 
		System.out.println("The y of MyPoint is " + MyPoint.getY() + ".");   
		System.out.println("MyPoint is " +MyPoint.showPoint() + ".");  
		Point YourPoint = new Point( );
		YourPoint.setPoint(-5,15);  

		System.out.println("The x of YourPoint is " + YourPoint.getX() + "."); 
		System.out.println("The y of YourPoint is " + YourPoint.getY() + "."); 
		System.out.println("YourPoint is " + YourPoint.showPoint() + "."); 

	}

}
