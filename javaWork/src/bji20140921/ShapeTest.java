package bji20140921;

public class ShapeTest {
	   public static void main(String args[]){
	      Rectangle r = new Rectangle();
	      Triangle t = new Triangle();
	      r.setWidth(10); //�޼ҵ� ����Ͽ� �� �Է�
	      r.setHeight(10);  //�޼ҵ� ����Ͽ� ���� �Է� 
	      System.out.println("�簢�� ���� : " + r.getArea() );

	      t.setX(10); //�޼ҵ� ����Ͽ� �� �Է�
	      t.setY(10); //�޼ҵ� ����Ͽ� ���� �Է� 
	      System.out.println("�ﰢ�� ���� : " + t.getArea() );
	   }
	}