package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		

		   // Declaramos la variable num que será el  número aleatorio para que el usuario tendrá que adivinar
			
			int num = 0; // número aleatorio
			int numUsuario;  //Esta variable pertenece a los números introducidos por el usuario
		
			//Introducimos e importamos el scanner para poder leer el teclado 
			Scanner sc = new Scanner(System.in);
			
			// Le decimos al sistema que escoja un número aleatorio a través de la función Math.random()
			num= (int) (Math.random()*100);
						
			//Le pedimos al usuario que por favor introduzca un número para ver si ha acertado el número secreto
			System.out.println("Por favor introduzca números comprendidos entre 1 y 100 para adivinar el número secreto");
			
			numUsuario=sc.nextInt();  //Leemos el número introducido por le usuario
			
			//Mediante while declaramos que los números introducidos deben ser mayor a 0 y menor que 100, ya que el usuario debe adivinar un número comprendidio entre 1 y 100
			while (num>0 && num<=100) {
				
				//Mediante el condicional if declaramos que si el número introducido por el usuario es menor que el número aleatorio, el sistema le devuelve que es menor
				if (num<numUsuario) {
					System.out.println("menor");
					
				//A través de else if declaramos que si el número introducido es mayor que el número aleatorio, el sistema devolverá que el número es mayor
				} else if (num>numUsuario) {
					System.out.println("mayor");
					
				//Si lo anterior no se cumple declaramos que si el número introducido es igual al número aleatorio, el sistema le da la enhorabuena al usuario ya que ha acertado el número
				} else if (num==numUsuario) {
					System.out.println("¡FELICIDADES!Has acertado el número");
				}
				numUsuario=sc.nextInt();//Leemos el numero introducido por el usuario
			}
			sc.close(); //Cerramos el scanner


	}

}
