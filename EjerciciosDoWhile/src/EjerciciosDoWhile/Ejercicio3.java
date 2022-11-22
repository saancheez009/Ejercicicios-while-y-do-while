package EjerciciosDoWhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaramos las variables num, numT y suma
		int num = 0; //Contador de los números
		int numT; //Número introducido por el usuario
		int suma = 0; 
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc= new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca un número para mostrarle la suma de los números hasta el número que haya introducido el usuario
		System.out.println("Por favor introduzca un número");
		numT=sc.nextInt();
		//Leemos el número
		
		
		do {
			suma +=num; //Se reliza la suma de los números por ejemplo (1+2+3+4+5...)
			num++;  
		} while (num <=numT ); //Mediante while declaramos que el sistema dejará de sumar números hasta el número introducido por el usuario
		
		//Le mostramos al usuario el total de la suma de los números
		System.out.println("El resultado de la suma de los números hasta el número "+numT+" es : "+suma);
		
		sc.close(); //Cerramos el scanner
	}

}
