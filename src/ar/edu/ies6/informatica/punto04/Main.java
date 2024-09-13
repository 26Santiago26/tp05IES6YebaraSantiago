package ar.edu.ies6.informatica.punto04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingrese un número entero entre 1 y 9: ");
        
        if (scanner.hasNextInt()) {
        	
        	int numero = scanner.nextInt();
    		if (numero == 0) {
				System.out.println("Ingrese un numero entre 1 y 9.");
			}
    		else if (numero > 0 && numero <= 9) {
    			for (int i = 1; i <= 10; i++) {
					System.out.println(numero + " x " + i + " = " + (numero * i));
    		}
				}
    		else {
    			System.out.println("Ingrese un numero entre 1 y 9.");
			}
		} else {
			System.out.println("Ingrese un numero entre 1 y 9.");
		}
        scanner.close();
      }

	}
