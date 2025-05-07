package checked.exp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputs {

	public static void main(String[] args) {


	BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		
				try {
					System.out.println("Enter name");
					
				String  name =	br.readLine();
				
				System.out.println("Enter amount");
				
				String  s1 =	br.readLine(); // 500
				
				int  amount =	Integer.parseInt(s1);
				
				System.out.println("name : "+name);
				System.out.println(amount + 100);
				
				
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		

	}

}
