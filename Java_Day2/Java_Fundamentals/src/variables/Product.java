package variables;

public   class Product { // Entity class or POJO class
	
	private  static int pid;
	private  static  String pname;
	
	static class Category{  // inner class
		 
			static String  cname = "grocery";
		 
	 }
	
	public Product() {
		
	}
	
	public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public  int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	
	

}
