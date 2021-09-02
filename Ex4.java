import java.util.Scanner;
public class Ex4 {
	public static void main(String[]args) {
	
	int numero;
	double Vhora,Htrabalhada,salario;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o número do funcionário :");
	numero = sc.nextInt();
	System.out.println("Digite as horas trabalhadas :");
	Htrabalhada = sc.nextDouble();
	System.out.println("Digite o valor recebido por hora : ");
	Vhora = sc.nextDouble();
	
	salario = Htrabalhada * Vhora;
	
	System.out.printf("O funcionário de número %s recebe U$%.2f" ,numero, salario);
	
	sc.close();
	}
}
