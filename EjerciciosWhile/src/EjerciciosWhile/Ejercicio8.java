package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Declaramos las variables altura y mayor
		
		int altura; //Esto es las alturas introducidas por el usuario 
		int mayor=0; //Esta variable nos mostrará la mayor altura introducida 
		
		//Introducimos e importamos el scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Le pedimos al usuario que por favor introduzca alturas de árboles para podr mostrarle cual es la altura más alta
			System.out.println("Por favor introduzca la altura de los árboles en cm , para poder mostrarle la altura más alta. Cuando ya no desee introducir más alturas, introduzca -1");
			altura= sc.nextInt(); //Leemos las alturas introducidas
			
			
			//Mediante while, declaramos que el usuario no pueda introducir más alturas al introducir un número negativo
			while (altura>0) {
				
				//Mediante el condicional if declaramos que lea la mayor altura
				if(altura>mayor) {
		            mayor=altura; //Igualamor mayor a la altura más grande
		            }
			altura=sc.nextInt(); //Leemos la altura introducida
			} 
			
			//Le mostramos al usuario la mayor altura 
			 System.out.println("El valor mayor es "+mayor);
			 
			 //Cerramos el scanner
			 sc.close();


	}

}
