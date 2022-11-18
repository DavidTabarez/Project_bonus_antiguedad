import java.util.Scanner;

public class Bonus_antiguedad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		byte antiguedad = 0;
		double sueldo = 0 , bono_antiguedad = 0;
		double sueldo_bono = 0;
		double bono_sueldo = 0;
		double total = 0;
		byte opcion = 0;
		
		System.out.println("Seleccione su tipo de pago");
		System.out.println("Pago por antiguedad (1): ");
		System.out.println("Pago por sueldo     (2):");
		opcion = entrada.nextByte();
		
		switch (opcion) {
		case 1:
			
			System.out.println("Ingrese su años trabajando: ");
			antiguedad = entrada.nextByte();
			
			System.out.println("ingrese su sueldo: ");
			sueldo = entrada.nextDouble();
			if (antiguedad <= 1) {
				System.out.println("no cuentas con antiguedad");
				
			} else if (antiguedad >= 2 && antiguedad < 5 ) {
				System.out.println("20%");
				bono_antiguedad = (sueldo * 0.20);
				total = (sueldo + bono_antiguedad);
				
			} else {
				System.out.println("30%");
				bono_antiguedad = (sueldo * 0.30);
				total = (sueldo + bono_antiguedad);
				
			} // fin if else
			
			System.out.println("Tu pago final es de: " + total);
			
			break;
			
		case 2: 
			System.out.println("Ingrese su sueldo: ");
			sueldo_bono = entrada.nextDouble();
			
			if (sueldo_bono < 1000) {
				bono_sueldo = (sueldo_bono * 0.25);
				total = (bono_sueldo + sueldo_bono);
				
			} else if (sueldo_bono >= 1000 && sueldo_bono <= 3500) {
				bono_sueldo = (sueldo_bono * 0.15);
				total = (bono_sueldo + sueldo_bono);
				
			} else {
				bono_sueldo = (sueldo_bono * 0.10);
				total = (bono_sueldo + sueldo_bono);
				
			} // fin del 2do if else
			
			System.out.println("Tu pago es de: " + total);
			
			break;
			
		default:
			System.out.println("Opcion no valida");
			break;
			
		} // fin del Switch
	
	}

}
