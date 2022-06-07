package q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter the no of elements in the array: ");
	int n=s1.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the elements in the array: ");
	for(int i=0;i<n;i++) {
		arr[i]=s1.nextInt();
	}
	try {
	System.out.println("Enter the index of the array element you want to access: ");
	int f=s1.nextInt();
	System.out.println("The array element at index "+f+" = "+arr[f]);
	}
	catch(ArrayIndexOutOfBoundsException a) {
		System.out.println(a);
	}
	catch(InputMismatchException in) {
		System.out.println(in);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
