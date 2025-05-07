package loops;

public class ForLoopDemo {

	public static void main(String[] args) {


		int ar[] = {10,20,30,40,50,60,70};
		
		for(int i =0; i < ar.length; i++) {
			
			 System.out.println(i + "   " +ar[i]);
			
		}
		
		System.out.println("length "+ar.length);
		
		
		// for each loop or  enhance for loop
		
		// print array or collections data
		System.out.println("For Each Loop");
		
		 for(int x :ar ) {
			 
			 System.out.println(x);
			 
		 }

	}

}
