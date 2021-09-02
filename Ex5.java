import java.util.Scanner;
public class Ex5 {
public static void main(String[]args) {
	
	String codigo1, codigo2;
	int numero1, numero2;
	double valor1, valor2,valorf;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira o código da(s) peça(s) : ");
	codigo1 = sc.nextLine();
	codigo2 = sc.nextLine();
	
	System.out.printf("Quantas peças %s vai querer?", codigo1);
	numero1 = sc.nextInt();
	System.out.printf("Quantas peças %s vai querer?", codigo2);
	numero2 = sc.nextInt();
	
	valor1 = numero1 * 15.10;
	valor2= numero2 * 15.10;
	valorf = valor1 + valor2;
	
	System.out.printf("VALOR A PAGAR : R$ %.2f", valorf);
	
	}
}
