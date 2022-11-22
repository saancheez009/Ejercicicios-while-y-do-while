package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaramos las variables num, cont, sumaP, sumaN, media y cntceros
		
		int num; //Esta variable pertenece a los números introducidos por el usuario 
		int cont=1; //Esta variable, es la que se usa para contar el total de números introducidos, el máximo de números es 10
		int sumaP=0; //Esta variable es la suma de los números positivos
		int sumaN=0; //Esta variable pertenece a la suma de los números negativos, esto nos ayudará a calcular la media de los números negativos
		int media=0; //Esta variable es el número total de números negativos
		int cntceros=0; //Esta variables es el contador de ceros totalesque el usuario ha introducido
		
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que por favor introduzca 10 números para hacer los cálculos.
		System.out.println("Por favor introduzca 10 números enteros (pueden ser positivos, negativos o cero).");
		
		// Mediante while declaramos que una vez introducidos 10 números el sistema no permita introducir más
		while (cont<11) {
			num=sc.nextInt(); //Leemos los números introducidos
			
			//Mediante el condicional if declaramos que los números positivos se sumen
		if (num>0) {
			sumaP +=num;
		} else if (num<0) { //Añadimos que los números negativos se sumen y se cuente el total de números negativos introducidos
			sumaN +=num;
			media ++;
		}else if(num==0) { //Finalmente declaramos por else if que los número que sean cero, se cuenten para saber cuántos ceros ha introducido el usuario
			cntceros++;
		}
		
		cont++;	
		}
		
		//Le mostramos al usuario la suma de los números positivos, la media de los números negativos( la media es la suma de números negativos entre el toteal de números negativos introducidos) y el total de ceros introducidos
		System.out.println("La suma de los números positivos es: "+sumaP+" la media de los números negativos es: "+(double)(sumaN/media)+" y los 0 introducidos son "+cntceros);
		
		sc.close(); //Cerramos el scanner
	}
}
