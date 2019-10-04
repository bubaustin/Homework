package edu.cgcc.cs160;

public class MainEntry {
	public static void main(String[] args) {
		//primitive data types--------------------------------------------------------
		int 	i =10;
		boolean b = false;
		char 	c = 'h';
		float	f = 7 ;
		double 	d = 10.5;
		
		
		
		//non-primitive----------------------------------------------------------------
		String str = "string";
		char[] cArray = new char[] {'h','e', 'l','l','o',};
		
		
		//printFromString();
		System.out.println(" From String: Hello, World!(main)");
		System.out.println("Interger value is:" + i);
		System.out.println("bool value is:" + b);
		System.out.println("char value is:" + c);
		System.out.println("float value is:" + f);
		System.out.println("double value is:" + d);
		System.out.println("string value is:" + str);
		System.out.println("char[] value is:" + String.copyValueOf(cArray));
		//printing arrays--------------------------------------------------------------

		
		for(int j =0; j < cArray.length; j++){
			System.out.println(j +""+ cArray[j]);
			
		}
	}

	public static void printFromString() {
		System.out.println("From Array: printFromString)");
	}
	/*
	public static void printFromArray() {
		System.out.println("From Array: printFromString)");
	}
	*/
}
