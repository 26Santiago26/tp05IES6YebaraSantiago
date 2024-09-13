package ar.edu.ies6.informatica.punto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Por favor, ingrese un numero entero: ");
        
        if (scanner.hasNextInt()) {
        	
        	int numero = scanner.nextInt();
        	
        	if (numero % 2 == 0) {
    			System.out.println("El numero es par y su triple es = "+ 3*numero);
    		} else {
    			System.out.println("El numero es impar y su doble es = "+ 2*numero);
    		}
		} else {
			
			System.out.println("Se ingreso dato incorrecto");

		}
        scanner.close();
	}

}
