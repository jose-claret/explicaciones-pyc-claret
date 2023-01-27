import java.util.Scanner;

public class DosDigitos {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el valor del número (del 1 al 99) para saber si tiene dos dígitos:");
    	float num1;
    	num1 = teclado.nextInt();
    	
    	if (num1 >= 10) {
    		System.out.println(num1 + " sí tiene dos dígitos.");
    	}
    	else {
    		System.out.println(num1 + " sólo tiene un dígito. ");
    	}
    }
}