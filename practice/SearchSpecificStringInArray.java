package practice;

public class SearchSpecificStringInArray {
	public static void main(String[] args) {
		String[] s= {"sun","mon","tue","wed","thu","fri"};
		String search="sun";
		boolean found= false;
		
		/*for(int i=0;i<s.length;i++) {
			String arrayValue= s[i];*/
		for(String arrayValue:s) {
			
			if(search.equals(arrayValue)) {
				found= true;
				break;
			}
		}
		
		if(found) {
		System.out.println(search +": is found");
		}
		else {
			
			System.out.println(search +": is not available in given array ");
			
		}}
	}
		



