package chapter3;

public class sample3_24 
{
	public static void main(String[]args) 
	 {
	  
	  Car18 car1;
	  car1=new Car18();
	  car1.show();
	  
	  
	  int number=1234;
	  double gasoline=20.5;
	  String str= "1����";
	  car1.setCar(number, gasoline);
	  car1.setName(str);
	  car1.show();
	 }
}
class Car18
{
	private int num;
	private double gas;
	private String name;
	
	
	
	public Car18()
	{
		num=0;
		gas=0.0;
		name="�S���W��";
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}

public void  setName(String nm)
{
	name=nm;
	System.out.println("�N���W�]��"+name);
}
public void show()
{
	System.out.println("�����O"+num);
	System.out.println("�T�o�q�O"+gas);
	System.out.println("���W��"+name);
}
}
