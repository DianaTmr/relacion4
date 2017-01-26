package Ejercicio33;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5};
		int[] imprimir = insertarNumero(original);
		int posicion = 0;
		
		for(int insertado : imprimir){
				System.out.println(insertado);
		}
	}
	public static int validarPosicion(){
		Scanner sc = new Scanner (System.in);
		boolean esCorrecto = false;
		String aux;
		int posicion = 0;
		do{
			System.out.print("Introduce la posición: ");
			aux = sc.nextLine();
			try{
				posicion = Integer.parseInt(aux);
				esCorrecto = true;
			}
			catch(Exception e){
				System.out.println("No has introducido un número");
			}
		}
		while(!esCorrecto);
		return posicion;
	}
		public static int validarNumero(){
			Scanner sc = new Scanner (System.in);
			boolean esCorrecto = false;
			String aux;
			int numero = 0;
			do{
				System.out.print("Introduce el número: ");
				aux = sc.nextLine();
				try{
					numero = Integer.parseInt(aux);
					esCorrecto = true;
				}
				catch(Exception e){
					System.out.println("No has introducido un número");
				}
			}
			while(!esCorrecto);
			return numero;
		}
		public static int[] insertarNumero(int[] insertado){
			int[] array = new int [insertado.length];
			int posicion = 0, numero=0;
			
			for(int i = array.length; i >= posicion; i--) {
				array[i+1] = array[i];
			}
			array[posicion] = numero;
			return array;
		}
	}

