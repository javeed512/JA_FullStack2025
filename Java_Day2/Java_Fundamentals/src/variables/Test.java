package variables;

public class Test {

	public static void main(String[] args) {


			Product p1 = new Product(10,"Mobile");
			
			System.out.println(p1.getPname());
			
			System.out.println(p1); //p1.toString();
			
			/*
			 * p1.setPname("Touch Mobile");
			 * 
			 * System.out.println(p1);
			 */
				
				Product p2 = new Product(20,"Laptop");
				
				System.out.println(p2);
				
				System.out.println(p1);
				
				System.out.println(p1.getPid());
				
				
				System.out.println(Product.Category.cname);
				
				
				
	}
	

}
