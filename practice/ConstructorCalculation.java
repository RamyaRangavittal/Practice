package practice;

public class ConstructorCalculation {

	
		int x;
		int y;
		int z;
	
		ConstructorCalculation()
		{
			x=2;
			y=5;
			z=7;
		}
		void sum() {
			System.out.println(x+y+z);
		}
		
		public static void main(String[] args) {
			ConstructorCalculation cal =new ConstructorCalculation();
			cal.sum();
		}

	}


