import java.util.Scanner;

public class abonación {
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el valor de el precio del vehículo y el que usted puede pagar:");
    	int num1, num2, abonacion;
    	num1 = teclado.nextInt();
    	num2 = teclado.nextInt();
    	abonacion = num1 - num2;
    	System.out.println("Debe abonar " + abonacion);
    }
}
