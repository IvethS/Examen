

import java.util.Scanner;
public class Ejercicio2 {
//Codigo usado con lo aprendido en clase
	public static void main(String[] args) {
		 Scanner lea = new Scanner(System.in);  
		 //Este Programa lo que use para realizarlo es un while, asi de esta forma compara el texto y la va repitir
		 // n cantidad de veces con la variable numero que esta es la que define cuantas veces se repetira.
		System.out.print("Introduce un numero: ");
		 int numero=0; 
	        numero=lea.nextInt(); 
	        System.out.println("Ingrese un Texto:  ");
	    	String texto = lea.next();
	    	int x=0;
	    	while (x<=numero)
	    	{
	    		System.out.print(texto);
	    		x+=1;
	    	}

	}

}
