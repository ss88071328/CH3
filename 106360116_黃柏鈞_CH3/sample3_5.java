package chapter3;

public class sample3_5 
{
	public static void main(String[]args) 
	 {
	  Car5 car1;
	  car1=new Car5();
	  
	  car1.num=1234;
	  car1.gas=20.5;
	  
	  car1.show();
	  car1.show();
	
	 }
}
class Car5
{
	int num;
	double gas;
	
	void show()
	{
		 System.out.println("�����O"+this.num);
		 System.out.println("�T�o�q�O"+this.gas);
	}
}



