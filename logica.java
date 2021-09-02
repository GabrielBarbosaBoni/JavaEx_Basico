import java.util.Scanner;
public class logica {
public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	int hora;
	
	System.out.println("Quantas horas ? : ");
	hora = sc.nextInt();
	
	if (hora < 12) {
		System.out.println("Bom dia");
	}
	else {
		System.out.println("Boa tarde");
	}
	if ( hora > 18) {
		System.out.println("Boa noite");
	}
	else {
		System.out.println("");
	sc.close();
	}
	if(hora > 24 && hora < 0)
		System.out.println("Insira uma hora válida");
	}
}
