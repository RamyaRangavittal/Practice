package practice;



public class TwoDimensioalArrayPractice {
	public static void main(String[] args) {
		int a[][]= {{100,200},{300,400},{500,600}};
		
		/*for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				System.out.println(a[i][j]);*/
		
		
		//Enhanced for loop
		for(int r[]:a) {
			for(int value:r) {
				System.out.println(value);
			}
		}
		
		
		
		
		
			}
		}
			
			
			
	