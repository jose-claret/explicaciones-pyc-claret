import java.util.Scanner;

public class DoWhileAct2 {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	int numeroCuenta, saldoActual, suma;
    	System.out.println("Ingrese los valores de los que desea saber la suma, introduzca 9999 para parar:");
    	saldoActual = 0;
    	numeroCuenta = 0;
    	suma = 0;
    	
    	do
    	{
			numeroCuenta = teclado.nextInt();

			
			if (numeroCuenta > 0)
			{
				saldoActual = teclado.nextInt();
				
				if (saldoActual > 0)
				{
					System.out.println("Estado de la cuenta: acreedor");
					suma = suma + saldoActual;
				}else if (saldoActual == 0) {
				
					System.out.println("Estado de la cuenta: nulo");
				} else{
					System.out.println("Estado de la cuenta: deudor");
				}
			}
    	}while (numeroCuenta >= 0);

    	System.out.println("La suma total de los acreedores es  " + suma);

    }
}
