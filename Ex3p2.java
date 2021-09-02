public class Ex3p2 {
	public static void main(String[]args) {
		
		int x, y,  modulo;
		
		x = 24;
		y = 6;


		if(x > y  ) {
			modulo = x % y;
		}
		else {
			modulo = y % x;
		}
		if (modulo == 0) {
			System.out.println("Multiplos");
		}
		else {
			System.out.println("Nao multiplos");
		}
	}
}
