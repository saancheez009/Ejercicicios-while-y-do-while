package EjerciciosDoWhile;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaramos las variables num y resto
		int num = 1;
		int resto;
		
		
		
		do {
			resto=num%2; //El resto es igual al resto de la división del número entre 2 
			
			//Mediante el condicional if declaramos que si el resto es cero, el número es par
			if (resto==0) { 
				System.out.println(num);  // se muestran los números pares
			}
			num++;
		} while(num>1 && num<200); //Con while declaramos que sólo se mostrarán los números pares comprendidos entre 1 y 200
		
		
		
		

	}

}
