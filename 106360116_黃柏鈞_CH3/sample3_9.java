package chapter3;

public class sample3_9 
{
	public static void main(String[]args) 
	 {
	  Car9 car1;
	  car1=new Car9();
	  car1.setNumGas(1234,20.5);
	 int number = car1.getNum();
	 double gasoline = car1.getGas();
	 System.out.println("�լd�˫~���ɱo��");
	 System.out.println("�����O"+ number + "�A�T�o�q�O"+gasoline);
			 
	   }
}

class Car9
{
	int num;
	double gas;
	
	int getNum()
	{
		System.out.println("�լd����");
		return num;
	}
	
	double getGas()
	{
		System.out.println("�լd�T�o�q");
		return gas;
	}
	
	void setNumGas(int n,double g)
	{
		 num=n;
		 gas=g;
		 System.out.println("�N�����]��"+num+"�A�N�T�o�q�]��"+gas);
	}
	
	
}
