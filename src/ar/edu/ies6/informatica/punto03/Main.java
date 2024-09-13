package ar.edu.ies6.informatica.punto03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 1;
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingrese un número entero entre 0 y 10: ");
              
        	if (scanner.hasNextInt()) {
        		
        		int numero = scanner.nextInt();
        		if (numero == 0) {
					System.out.println("El factorial es: "+contador);
				}
        		else if (numero > 0 && numero <= 10) {
        			
					while (numero >= 1) {
						contador = contador*numero;
						System.out.println("El factorial es: "+contador);
						numero--;
					}
				}
        		
        		else {
        			System.out.println("Ingreso un dato incorrecto.");
        		}        		        		
        		
        } else {
        	
        	System.out.println("Ingreso un dato incorrecto.");
        	
        }
        	scanner.close(); 
	}

}
