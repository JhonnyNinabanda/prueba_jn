package cajero.automatico;

import java.util.Scanner;

public class MainCajero {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner (System.in);
		
		String clave = "85DB";
		int opcion = 0;
		int saldoInicial = 2500;
	
	
		
		System.out.println("Bienvenidos Banco Pichincha");
		System.out.println("===========================");
		
		System.out.println("Ingrese la clave: ");
		
		String cl = Lector.nextLine();
		
		boolean comparacion=cl.equals(clave);
		
		if (comparacion == true) {
			
			do {
				System.out.println("**************************");
				System.out.println("Banco Pichincha Elija una opcion: ");
				System.out.println("1. Consultar pagos");
				System.out.println("2. Realizar Transferencia");
				System.out.println("3. SALIR");
				System.out.println("**************************");
				
				
				opcion = Lector.nextInt();
				if(opcion == 1) {
					
					System.out.println("No tiene ningun pago pendiente");
					
				} else if  (opcion== 2) {
					
					System.out.println("Ingrese el nrto de cuenta de destino: ");
					int cuenta = Lector.nextInt();
					System.out.println("Ingrese el mnonto a transferir: ");
					int monto = Lector.nextInt();
					
					int saldoFinal = saldoInicial-monto;
					
					System.out.println("Su nuevo saldo es: " +saldoFinal);
					
				}
				
				
			} while (opcion !=3);
			
		}
		
	}

}
