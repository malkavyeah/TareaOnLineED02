package Saluda;

import java.util.Scanner;

public class Saluda {
	String nombre="";
	
	public  String getNombre() {
		 return nombre;
		 
		 
	 }
	 
	 public void setNombre(String nombre){
		 nombre=nombre;
	 }
	 
	 public void pideNombre(){
		 System.out.println("¿Cual es tu nombre?");
		 Scanner entrada=new Scanner(System.in);
		 nombre=entrada.next();
	 }
	 
	 public String toString(){
			String mensaje="¡Hola!"+nombre; 
			return mensaje;
		 }
		 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Cual es tu nombre?");
		 Scanner nombre=new Scanner(System.in);
		 //nombre=entrada.next();
	     System.out.println("¡Hola!"+nombre); 
		
		 
	}

}
