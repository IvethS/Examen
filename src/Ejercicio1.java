
import java.util.Scanner;
public class Ejercicio1 {
//Codigo Usado con lo aprendido en Clase.
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Ingrese un rating de 1 a 5 para The Amazing SpiderMan2: ");
		int num = s.nextInt();
		//Este Case se realizo para que pudiera comparar el codigo ingresado si se fija lee la variable numero
		// y en base a la variable numero se dan los casos, como puede observar case 1 muestra la palabra pesima
		// de esa forma sucesivamente se va dando.
		switch (num)
		{
		case 1 :
			System.out.print("Resultado: "+("Pesima"));
		break;
		
		case 2 :
			System.out.print("Resultado: "+("Mala"));
		break;
		
		case 3 :
			System.out.print("Resultado: "+("Regular"));
		break;
		
		case 4 :
			System.out.print("Resultado: "+("Buena"));
		break;
		case 5 :
			System.out.print("Resultado: "+("Excelente"));
		break;
		
		default:
			System.out.print("Califacion no Reconocida");
			break;
		}
// aqui en lo ultimo es por si ingrese un numero que no esta dentro del rango no lo va reconocer.
	}

}
