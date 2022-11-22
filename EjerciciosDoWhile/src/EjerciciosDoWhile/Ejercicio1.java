package EjerciciosDoWhile;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaramos la variable num y la inicializamos a 1 para poder mostrar los números del 1 al 20 utilizando do while
		int num=1;
		
	
		//Declaramos mediante do que tenemos que mostrar números en orden
		do {
			System.out.println(num); //Mostramos los números
			num++;
		} while (num <=20 ); //Al poner como máximo el 20 , el sistema nos mostrará los números del 1 al 20
		
	 
	}

}
