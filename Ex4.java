import java.util.Scanner;
public class Ex4 {
	public static void main(String[]args) {
	
	int numero;
	double Vhora,Htrabalhada,salario;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o n�mero do funcion�rio :");
	numero = sc.nextInt();
	System.out.println("Digite as horas trabalhadas :");
	Htrabalhada = sc.nextDouble();
	System.out.println("Digite o valor recebido por hora : ");
	Vhora = sc.nextDouble();
	
	salario = Htrabalhada * Vhora;
	
	System.out.printf("O funcion�rio de n�mero %s recebe U$%.2f" ,numero, salario);
	
	sc.close();
	}
}
