package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaramos las variables edad, suma, media, edadT, edadM y edadTotal.
		
		int edad;  //Edad es las edades introducidas por el usuario
		int suma = 0; //Esta variable es la suma de todas las edades
		int media = 0; //Esta variable es la media de todas las edades introducidas
		int edadT=0; //Esta variable es el número total de edades introducidas
		int edadM = 0;  //Esta variable mostrará el número total edades que cumplen la mayoría de edad
		int edadTotal=0; //Al igual que la variable edadT esta variable es el número total de edades introducidas
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que por favor introduzca las edades de los alumnos del centro y cuando no quiera introducir más números, que introduzca un número negativo
		System.out.println("Por favor introduzca las edades de los alumnos del centro, cuando no quiera introducir más edades, introduzca un número negativo");
		edad=sc.nextInt(); //Leemos las edades
		
		
		//Mediante while declaramos que una vez que el usuario introduzca un número negativo, el sistema dejará de introducir números
		while (edad>0) {
			suma +=edad; //Realizamos la suma de las edades 
			edadT++; //Calculamos el número de edades introducidas para hacer la media
			edadTotal++; //Calculamos el número total de edades introducidas para mostrarle al usuario
			
			//Mediante el condicional if declaramos que se cuenten el total de edades mayor a 18 introducidas
			if (edad>=18) {
				edadM++;	
			}
		
			edad=sc.nextInt(); //Leemos las edades
		} 
		
		//Le mostramos al usuario la suma de todas las edades, la media de las edades, el número de alumnos totales y el número de alumnos mayores de edad
		System.out.println("La suma de todas las edades es "+suma+", la media de todas las edades es "+(media=(suma/edadT++))+", el número de alumnos en total es "+(edadTotal++)+" y los alumnos mayores de edad son "+(edadM++));
	
		//Cerramos el scanner
		sc.close();
	}


	}

