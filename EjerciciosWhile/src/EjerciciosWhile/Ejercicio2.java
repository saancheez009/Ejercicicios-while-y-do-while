package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaramos las variables num y suma
		
		int num; //La variable num, es los números introducidos por el usuario
		int suma=0; //En la variable suma, guardaremos la cantidad de números introducidos por el usuario
	
		//Declaramos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que por favor introduzca números positivos enteros para poder contarlos números que ha introducido, cuando el usuario desee parar se le pide que introduzca un número negativo
		System.out.println("Por favor introduzca números enteros positivos, cuando ya no quiera insertar más números por favor introduzca un número negativo");
		num=sc.nextInt();
		
		//Mediante el condicional while declaramos que si el num es mayor o igual a 0 se realizará la operación que se indica abajo de este
		while(num>=0) {
			num=1; //Declaramos que el número vale 1
			suma +=num; //Se irán contando la cantidad de números introducidos por el usuario
			num=sc.nextInt();  //Se lee el número introducido por el usuario
		}
		
		System.out.println("Usted ha introducido: "+suma+" números"); //Le mostramos al usuario la cantidad de números que ha introducido
		
		sc.close(); //Cerramos el scanner
	}

}
