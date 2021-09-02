import java.util.Scanner;
public class Ex6 {
public static void main(String[]args) {
	
	double a, b, c;
	double triangulo, circulo, trapezio, quadrado, retangulo;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("DÊ os respectivos valores de a b e c : ");
	a = sc.nextDouble();
	b = sc.nextDouble();
	c = sc.nextDouble();

	
	triangulo = a * c / 2;
	System.out.printf("triangulo: %.3f\n",triangulo);
	
	circulo =3.14159 * c * c;
	System.out.printf("circulo: %.3f\n", circulo);
	
	trapezio = (a+b)*c / 2;
	System.out.printf("trapezio: %.3f\n", trapezio);
	
	quadrado = b * b;
	System.out.printf("quadrado: %.3f\n", quadrado);
	
	retangulo = a * b;
	System.out.printf("retangulo: %.3f\n", retangulo);
	
	sc.close();
	}
}
