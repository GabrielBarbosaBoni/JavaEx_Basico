import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha errada!Tente novamente");
			senha=sc.nextInt();
		}
		if (senha == 2002) {
			System.out.println("Senha correta");
		}
		sc.close();
	}
}
