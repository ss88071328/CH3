package chapter3;

public class sample3_23 
{
	public static void main(String[]args) 
	 {
	  System.out.println("�ŧicar1");
	  Car17 car1;
	  car1=new Car17();
	  car1.setCar(1234,20.5);
	  
	  System.out.println("�ŧicar2");
	  Car17 car2;
	  
	  System.out.println("�Ncar1���wcar2");
	  car2=car1;
	  
	  System.out.println("car1��");
	  car1.show();
	  
	  System.out.println("car2��");
	  car2.show();
	  
	  System.out.println("����car1���������");
	  car1.setCar(2345,30.5);
	  
	  System.out.println("car1��");
	  car1.show();
	  
	  System.out.println("car2��");
	  car2.show();
	  	  
	 }
}
class Car17
{
	private int num;
	private double gas;
	
	
	public Car17()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q��"+gas);
	}

public void show()
{
	System.out.println("�����O"+num);
	System.out.println("�T�o�q�O"+gas);
	
}


}
