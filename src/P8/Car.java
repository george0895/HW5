package P8;

class Car {
	private int num;
	private double gas;
	
	public Car() {
		num =0;
		gas =0;
		System.out.println("�H�Ͳ��T��");
	}
	
	public void setCar(int n,double g) {
		num =n;
		gas =g;
		System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}