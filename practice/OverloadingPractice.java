package practice;

public class OverloadingPractice {
	
int sum(int a,int b) {//1
	return (a+b);
	
}
int sum(int a,int b,int c) {//2
	return (a+b+c);
	
}

	double sum(double a,double b) {//3
		return (a+b);
		
	}
double sum(double a, double b,double c) {//4
	return (a+b+c);
	
}

public static void main(String[] args) {
	OverloadingPractice op=new OverloadingPractice();
	System.out.println(op.sum(5, 7));//1
	System.out.println(op.sum(9, 7,3));//2
	System.out.println(op.sum(5.3, 7.8));//3
	System.out.println(op.sum(4.2, 1.7,2.3));//4compare

}}