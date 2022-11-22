package EjerciciosDoWhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Declaramos la variable num que será el  número aleatorio que el sistema tendrá que adivinar
		int numero;
		String respuesta;
		int menor=0;
		int mayor=101;
		Scanner sc = new Scanner(System.in);
						//creamos el bucle do while having hard sex on the beach holy shit so good i can't
						
						do {
							numero=(int)(Math.random()*(mayor-menor)+menor);
							System.out.println("¿Es el número "+ numero +"?");
							respuesta=sc.nextLine();
							
							if (respuesta.equals("MAYOR")) {	
								mayor=numero;
								} else if (respuesta.equals("MENOR")); {
								menor=numero;
								}
						
						} while(!respuesta.equals("IGUAL"));
								System.out.println("¡ENHORABUENA!¡HAS ACERTADO!");
	          
							


			

		

	}
}
