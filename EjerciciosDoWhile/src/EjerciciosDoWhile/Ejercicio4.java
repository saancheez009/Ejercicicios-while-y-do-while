package EjerciciosDoWhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declaramos las variables num y numT
		int num = 0; //Número del 1 al 10
		int numT; //Es el número introducido por el usuario 
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc =new Scanner(System.in);
		
		//Le pedimos al susuario que por favor introduzca un número para mostrarle la correspondiente tabla de multiplicación
		System.out.println("Por favor introduzca un número para mostrarle sus correspondiente tabla de multiplicación");
		numT=sc.nextInt(); //Leemos el número introducido por el usuario
		
		do {
			
			//Mostramos la tabla de multiplicar dependiendo del número que introduzca el usuario
			System.out.println(numT + " x " + num + " = " + numT*num);
			num++; //Contamos los números
		} while (num <=10 ); //El sistema dejará de ejecutarse al introducir un número mayor a 10
		
		sc.close(); //Cerramos el scanner
	}

}
