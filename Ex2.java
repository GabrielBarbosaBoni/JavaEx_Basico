import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio,resultado;
		Locale.setDefault(Locale.US);
		raio = sc.nextDouble();
		resultado = raio * raio;
		resultado = resultado * 3.14159;
		System.out.println(resultado);
		
		sc.close();
	}
}
