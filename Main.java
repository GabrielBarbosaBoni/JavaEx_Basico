import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String product1 = "computer";
		String procuct2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100.0;
		double price2 = 650.50 ; 
		double measure = 53.234567;
				
		System.out.printf("Products:\nComputer whice price is $ %.2f%n" , 
				price1  );
		System.out.printf("Office desk, which price is $ %.2f%n" , price2);
		System.out.printf("\nRecord: %d years old, code %d and gender: %s%n" , age, code, gender);
		System.out.printf("\nMeasue with eight decimal places: %.8f\n"
				+ "Rouded (three decimal places): %.3f\n", measure , measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
