package chapter3;

public class sample3_7 
{
	public static void main(String[]args) 
	 {
	  Car7 car1;
	  car1=new Car7();
	  
	  car1.setNum(1234);
	  car1.setGas(20.5);
	   }
}

class Car7
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		 num=n;
		 System.out.println("�N�����]��"+num);
	}
	
	void setGas(double g)
	{
		gas=g;
		 System.out.println("�N�T�o�q�]��"+gas);
	}
}

