package uncheck.exp;

public class ExpDemo {

	public static void main(String[] args) {  // caller

		System.out.println("Open File");
		System.out.println("Read data");
		System.out.println("Write data");
		
			try {
			int res =	div(10,2);
		System.out.println("Result "+res);  // risky code
		
				String name = "javeed";
				
				System.out.println(name.length());
				
		
				System.out.println("find array length "+ args.length);
				
				//System.out.println(args[0]);// arrayy index out of bound
				
			}
			catch(ArithmeticException e) {
				
				e.printStackTrace();
				
				//e.getMessage();
				
				System.err.println("Sorry! You cannot div num by zero");
				
			}
			catch (NullPointerException e) {

					e.printStackTrace();
				
			}
			catch(Exception e) {
				
				e.printStackTrace();
				
				
			}
			
			finally {
				
				System.out.println("close file");
				
			}
		
	
		
		System.out.println("Thank you");
			

	}
	
	
	// javeed 
	public static  int div(int a , int b)throws ArithmeticException { // callee
		
		
		  int result = a/b;
		  
		  return result;
		
	}
	

}
