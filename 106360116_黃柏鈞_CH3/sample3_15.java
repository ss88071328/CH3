package chapter3;

public class sample3_15 
{
	public static void main(String[]args) 
	 {
	  Car15 car1;
	  car1=new Car15();
	  car1.show();
	  
	  Car15 car2;
	  car2=new Car15(1234,25.0);
	  car2.show();
	  	  
	 }
}
class Car15
{
	private int num;
	private double gas;
	
	
	public Car15()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car15(int n, double g)
	{
		this();
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
	}

public void show()
{
	System.out.println("�����O"+this.num);
	System.out.println("�T�o�q�O"+this.gas);
	
}
}
