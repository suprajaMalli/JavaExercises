package fr.epita.factorial.datamodel;

public class Factorial {

	//int fact = 5;
	public static int method1() {
		int i,fact=1;
		int number=5;//It is the number to calculate factorial.
		for(i=1;i<=number;i++){
		fact=fact*i;
		}
		return fact;
	}
	
	public static int method2(int n) {
	   // int n= 5;
		if (n == 0)
			return 1;
			else 
			return(n * method2(n-1));
		
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=method1();
		System.out.println("method1 output"+a);
		int b=method2(5);
		System.out.println("method2 output"+b);
	}

}
