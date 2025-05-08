package lambda.exp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {


		 // function type lambda
      MyInterface mi = (int a, int b)->{return a+b;};   // anonymous block or lambda exp
		
  			System.out.println("Sum of integers " + mi.add(4, 6));
  			
  			MyInterface.m1(); // static method
  			mi.m2();
  			
  			
  			
  		DisplayInterface  di = (n1)->{ System.out.println("Welcome "+n1);};
  				
  				di.display("Javeed");
  				
  				Consumer<String>  c1 =  System.out::println; // method reference
  				
  					c1.accept("king khan");
  			
  					String s1 ="5000";
  					
  				Function<String,Integer> fi = Integer::parseInt;
  				
  						int n1 =	fi.apply(s1);
  						int n2 =	fi.apply("3000");
  						
  						System.out.println(n1+n2);
  
  						
  		Consumer<String> c2 = (n)->{ System.out.println("Welcome "+n);};
  				
  					c2.accept("Lohith");
  					
  		Supplier<Integer> sup = ()->{return 100;};
  		
  			System.out.println(sup.get());
  			
  		Predicate<Integer>  pd = (num)->{ return num > 0;};
  		
  				System.out.println(pd.test(-50));
  				
  				
  				 Consumer<String> c = String::new; // new String("javeed");
  				 c.accept("javeed");
  				 
  				
  				 
  				 
	}

}

/*// Not required
* public class   DemoImp  implements MyInterface{
*   
*       int  add(int a, int b){
*       
*       	return a+b;
*       }
* 
* 	mi =	new DemoImp();
* 
* }
*
*
*/

