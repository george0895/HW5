package P34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�п�J�r��");
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			
			System.out.println("�H��J�r��"+str);
		}
		
		catch(IOException e) {
			System.out.println("��J��X���~");
		}
	}

}
