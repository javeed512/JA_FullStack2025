package checked.exp;

public class CheckedExpDemo {

	public static void main(String[] args) {


			System.out.println("Hello friends");
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}  // it pause for 2sec
			
			System.out.println("Thank you");
		
		
	}

}
