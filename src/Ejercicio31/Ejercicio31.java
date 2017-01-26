package Ejercicio31;

public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3};
		int[] b = {4,5,6,7,8};
		int[] c = ConcatenaArrayPro(a,b);

		for (int resultado : c){
		System.out.print(resultado);
		}
 	}
	
	public static int[] ConcatenaArrayPro(int[] a, int[] b){
		int[] c = new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
		return c;
	}
}
