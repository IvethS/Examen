
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		//Codigo usado con lo aprendido en clase
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese numero 1: ");
		int num1 = s.nextInt();
		System.out.print("Ingrese numero 2: ");
		double num2 = s.nextDouble();
		System.out.print("Ingrese numero 3: ");
		int num3 = s.nextInt();
		Double Promedio;
		Promedio= (num1+num2+num3)/3;
		
		if (Promedio>=1000)
			System.out.print("Excelente ");
		else if (Promedio>=700)
			System.out.print("Bueno ");
		else if (Promedio>=500)
			System.out.print("Suficiente ");
		else 
			System.out.print("Has Perdido ");
	}

}
