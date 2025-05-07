package user.exp;

public class BankCustomers {

	public static void main(String[] args) {

		int acno[] = {101,102,103,104,105};
		String names[] = {"king","smith","tom","javeed","ford"};
		double  balance[] = {5000.0,60.0,4000.0,70.0,9000.0};
		
		
		for (int i = 0; i < acno.length; i++) {
			
			System.out.println(acno[i] +"  "+names[i] +"       "+balance[i]);
			
			if(balance[i] < 1000) {
				
				// raise exception
				try {
					throw new  LowBalanceException("Balance is Low");
				}
				catch(LowBalanceException e) {
					
					System.err.println(names[i]+"  your balance is low , deposit some amount");
					
				}
				
			}
			
			
		}
		
		
	}

}
