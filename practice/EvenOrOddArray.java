package practice;

public class EvenOrOddArray {

	public static void main(String[] args) {
		int a[]= {7,2,6,5,8};
		
		for(int r:a) {
			
			if(r%2!=0) {
				System.out.println(r  +":   is odd");
			}else {
				System.out.println(r  +":   is even");
			}
		}

	}

}
