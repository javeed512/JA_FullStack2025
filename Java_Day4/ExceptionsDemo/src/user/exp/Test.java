package user.exp;

public class Test {
	
		
			public static void main(String[] args) {
				
					try {
				throw	new MyException();
					}
					catch (MyException e) {

							e.printStackTrace();
							System.err.println("User exp : MyException handled");
						
					}
				
			}
	

}
