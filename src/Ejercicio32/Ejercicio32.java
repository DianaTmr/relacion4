package Ejercicio32;

import java.util.Arrays;

public class Ejercicio32 {
	

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = CopiaArrayPro(a);
		
		System.out.println("Original");
		for (int original : a){
			System.out.print(original+ " ");
		}
		System.out.println("\nCopia");
		for (int copia : b){
			System.out.print(copia+ " ");
		}
	}
	
	public static int[] CopiaArrayPro(int[]a){
		int[] b = Arrays.copyOf(a, a.length);
		return b;
	}
}
