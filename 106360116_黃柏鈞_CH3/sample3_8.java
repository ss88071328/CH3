package chapter3;

public class sample3_8 
{
	public static void main(String[]args) 
	 {
	  Car8 car1;
	  car1=new Car8();
	  
	  int number=1234;
	  double gasoline=20.5;
	  
	  car1.setNumGas(number,gasoline);
	   }
}

class Car8
{
	int num;
	double gas;
	
	void setNumGas(int n, double g)
	{
		 num=n;
		 gas=g;
		 System.out.println("�N�����]��"+num +"�A�N�T�o�q�]��"+gas);
	}
	
	void show()
	{
		System.out.println("�����O"+num);
		 System.out.println("�T�o�q�O"+gas);
	}
}

