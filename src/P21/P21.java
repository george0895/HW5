package P21;

public class P21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] test;
			test = new int[5];
			
			System.out.println("�N�ȫ��w��test[10]");
			
			test[10] = 80;
			
			System.out.println("�N80���w��test[10]");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�W�X�}�C�d��F");
		}
		
		System.out.println("���Q�������F");
	}

}
