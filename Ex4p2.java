import java.util.Scanner;
public class Ex4p2 {
	public static void main(String[]args) {
		
		int am, pm ,comeco, fim,  modulo;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Que horas começou? : ");
		comeco = sc.nextInt();
		System.out.printf("Que horas terminou? : ");
		fim = sc.nextInt();



		if(comeco > fim  ) {
			comeco = 24 - comeco;
			comeco = comeco  + fim;
			System.out.printf("O jogo durou %d hora(s)",comeco);
		}
		else {
			comeco = fim - comeco;
			System.out.printf("O jogo durou %d hora(s)",comeco);					
		}
		if( comeco == 0 && fim == 0) {
			System.out.printf("O jogo durou 24 horas");
		}
	}
}
