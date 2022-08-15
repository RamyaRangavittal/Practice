package practice;

public class TwoDimArrayAddition {
	public static void main(String[] args) {
		
	
	
	int a[][]= {{2,3},{4,6},{7,3}};
	int b[][]= {{3,5},{4,9},{2,11}};
	int c[][]= new int[3][2] ;// 3 rows and 2 column
	
	for(int i=0;i<3;i++) {
		
		for(int j=0;j<2;j++) {
			
			c[i][j]= a[i][j]+b[i][j];
			
			
					System.out.println(c[i][j]+"     ");
					
					
				}
				System.out.println();
			}
			
		
		}
		
	}
	