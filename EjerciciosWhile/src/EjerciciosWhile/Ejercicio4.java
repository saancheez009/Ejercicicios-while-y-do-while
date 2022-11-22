package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num=0;	//	Declaramos la variable num, que serán los números introducidos por el usuario
		int resto ; //Declaramos la variable resto que será el resto de la división del número introducido entre 2
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in); 
		
		//Le pedimos al usuario que por favor introduzca números para comprobar mediante while si son par o impar
		
		System.out.println("Por favor introduzca números para comprobar si son par o impar");
		num=sc.nextInt(); //Leemos el número introducido por el usuario
		
		// Mediante el condicional while, declaramos que si los números introducidos son distinto de cero, si son pares se les dira que el número es par y si no impar, esto lo hacemos mediante un if
		//Cuando el usuario introduzca un cero el sistema se detendrá y dará el resultado si es par o no
		while (num!=0) {
			resto =num%2; //Para saber si un número es par, calculamos el resto de la división del número introducido entre 2
			if (resto==0) { //Si resto es igual a 0 el número será par
				System.out.println("El número introducido es par");
			} else {  // Si el resto es distinto de 0 el número será impar
				System.out.println("El número introducido es impar");
			}
			num=sc.nextInt(); //Se le pide otro número al usuario
		}
sc.close(); //Cerramos el scanner
	}

}
