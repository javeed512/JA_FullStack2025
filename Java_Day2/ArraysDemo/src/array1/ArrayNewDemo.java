package array1;

public class ArrayNewDemo {

	public static void main(String[] args) {

		
			int ar[] = new int[4];

			   ar[0] = 99;
			   ar[3] = 50;
			
			
			for (int i = 0; i < ar.length; i++) {
				
				System.out.println(ar[i]);
			}
			
			
			int  arr[][] = new int[3][2];
			
			
			System.out.println("arr "+arr);
			System.out.println("arr[0] "+arr[0]);
			
			System.out.println("arr[0][0] "+arr[0][0]);
				
			
			arr[1][0] = 30;
			
			System.out.println(arr[1][0]);
			
			
			int   array[][][] = new int[3][2][2];
			
			

	}

}
