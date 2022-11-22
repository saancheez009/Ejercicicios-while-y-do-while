package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int suma=0; // Declaramos la variable suma que equivale a la suma de los números introducidos por el usuario
		int num=0;	//	Declaramos la variable num, que serán los números introducidos por el usuario
		double media = 0;  //Declaramos la variable media que será la cantidade de números introducidos por el usuario
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que por favor introduzca números para realizar la suma de estos. Y que cuando ya no quiera sumar más números, introduzca un número negativo
		System.out.println("Por favor introduzca números enteros positivos para sumarlos, cuando ya no quiera sumar más números, introduzca un número negativo");
		num=sc.nextInt(); //Leemos el número introducido por el usuario
		
		// Mediante el condicional while, declaramos que si los números introducidos son mayor o igual que cero, se realizará la suma de estos
		//Cuando el usuario introduzca un número negativo la suma de números se detendrá y dará el resultado
		while (num>=0) {
			suma +=num; //la variable suma es num+num+num... depende los números que introduzca el usuario
			media ++; //Contamos los números introducidos por el usuario para calcular la media, que es igual a la división de la suma de los números entre los números totales introducidos
			num=sc.nextInt(); //Se le pide otro número al usuario
		}
		
	
		System.out.println("La media de todos los números introducidos es: "+(suma/media)); // Le mostramos al usuario la media de la suma de los números que ha introducido
		sc.close(); 
		//Cerramos el scanner

	}

}
