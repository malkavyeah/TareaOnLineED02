package Saluda;

import java.util.Scanner;

public class Saluda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		   
		  Scanner entrada=new Scanner(System.in);
		System.out.println("¿Cual es tu nombre?");
		nombre= entrada.next();
		System.out.println("¡Hola"+nombre+"!");
	}

}
