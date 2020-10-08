package bji20140921;

public class Cylinder extends Circle2{
	int height = 10;
	
	public int volume(){
		return area()*height;
	}
	public String showCylinder(){
		return showCircle()+", Height =" + height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cyd = new Cylinder();
		
		System.out.println("ºÎÇÇ : "+cyd.volume());
		System.out.println("showCylinder : " + cyd.showCylinder());
	}

}
