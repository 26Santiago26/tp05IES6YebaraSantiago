package ar.edu.ies6.informatica.punto05.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	//atributos encapsulados
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	//constructor por defecto
	
	public Persona() {
        this.dni = "";
        this.nombre = "";
        this.fechaNacimiento = LocalDate.now();
        this.provincia = "";
    }
	
	
	
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	

    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }



	//metodos accesores
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	//otros metodos
	
	public int calcularEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    // Método para verificar si es mayor de edad
	
    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }
    
    public void mostrarDatos() {
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
        System.out.println("Provincia: " + this.provincia);
        System.out.println("Edad: " + calcularEdad());
        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }
    }
	
}
