package oops;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student();

		
			s1.sid = 101;
			s1.sname = "tom";
		System.out.println(s1);

		System.out.println(s1.sid);
		System.out.println(s1.sname);

		Student s2 = new Student();
		System.out.println(s2);

		System.out.println(s2.sid);
		System.out.println(s2.sname);
		
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		
		

	}

}
