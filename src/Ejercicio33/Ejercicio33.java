package Ejercicio33;

import java.util.Scanner;
import java.util.Arrays;


public class Ejercicio33 {


		public static void main(String[] args) {
					int[] array = { 1, 2, 3, 4, 5 };
					int posicion = validarPosicion();
					int numero = validarNumero();
					
					array = insertarNumero(array, posicion, numero);
					imprimirArray(array);
					
				}
		
				public static void imprimirArray(int[] array){
					for (int resultado : array){
						System.out.print(resultado+" ");
					}
					
				}
				
				public static int validarPosicion() {
					Scanner sc = new Scanner (System.in);
					String aux;
					boolean esNumero = false;
					int posicion = 0;
					do {
						System.out.print("Introduce la posición: ");
						aux = sc.nextLine();
						esNumero = validarCifra(aux);
						if(esNumero) {
							posicion = Integer.parseInt(aux);
						}
					}
					while(!esNumero);
					return posicion;
				}
				
				public static int validarNumero() {
					Scanner sc = new Scanner (System.in);
					String aux;
					boolean esNumero = false;
					int numero = 0;
					do{
						System.out.print("Introduce el número que desea insertar: ");
						aux = sc.nextLine();
						esNumero = validarCifra(aux);
						if(esNumero){
							numero = Integer.parseInt(aux);
						}
					}
					while(!esNumero);
					return numero;
				}
				
				public static boolean validarCifra(String numero) {
					boolean esCorrecto = false;
					try {
						Integer.parseInt(numero);
						esCorrecto = true;
					}
					catch(Exception e) {
						System.out.println("No has introducido un número");
					}
					return esCorrecto;
				}

				public static int[] insertarNumero(int[] array, int posicion, int numero) {
					
					int[] array_aux = Arrays.copyOf(array, array.length+1);;
					
					for(int i = array_aux.length-2; i >= posicion; i--) {
						array_aux[i+1] = array_aux[i];
					}
					array_aux[posicion] = numero;
					return array_aux;
				}
		
	}
