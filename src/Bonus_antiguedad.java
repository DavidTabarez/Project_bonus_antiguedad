import java.util.Scanner;

public class Bonus_antiguedad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		byte antiguedad = 0;
		double sueldo = 0 , bono_antiguedad = 0;
		double sueldo_bono = 0;
		double bono_sueldo = 0;
		double total = 0;
		
		System.out.println("Ingrese su años trabajando: ");
		antiguedad = entrada.nextByte();
		
		if (antiguedad <= 1) {
			System.out.println("no cuentas con antiguedad");
			
		} else if (antiguedad >= 2 && antiguedad < 5 ) {
			System.out.println("20%");
			
		} else {
			System.out.println("30%");
			
		} // fin if else
			
		

	}

}
