package P30;

public class P30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		
		try {
			car1.setCar(1234, -10);
		}
		catch(CarException e){
			System.out.println("�ߥX"+e+"�F");
		}
		
		car1.show();
	}

}

class Car{
	private int num;
	private double gas;
	
	public Car() {
		num =0;
		gas =0;
		System.out.println("�H�Ͳ��T��");
	}
	
	public void setCar(int n,double g)throws CarException
	{
		if(g<0) {
			CarException e = new CarException();
			throw e;
		}else {
			num = n;
			gas = g;
			System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
		}
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}

class CarException extends Exception
{
	}