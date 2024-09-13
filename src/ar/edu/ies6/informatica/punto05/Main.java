package ar.edu.ies6.informatica.punto05;

import ar.edu.ies6.informatica.punto05.model.Persona;

import java.time.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Persona persona1 = new Persona();
        System.out.println("Persona 1 (Constructor por defecto):");
        persona1.mostrarDatos();
        System.out.println();

        Persona persona2 = new Persona("12345678", "Juan Pérez", LocalDate.of(1990, 5, 15), "Buenos Aires");
        System.out.println("Persona 2 (Constructor parametrizado):");
        persona2.mostrarDatos();
        System.out.println();
        
        Persona persona3 = new Persona("87654321", "María López", LocalDate.of(2005, 10, 20));
        System.out.println("Persona 3 (Constructor con DNI, nombre y fecha de nacimiento):");
        persona3.mostrarDatos();
        }

}
