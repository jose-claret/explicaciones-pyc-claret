import java.util.Scanner;

public class Posv0Neg {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el valor del número para saber su signo:");
    	float num1;
    	num1 = teclado.nextInt();
    	
    	if (num1 > 0) {
    		System.out.println(num1 + " es positivo.");
    	}
    	else if (num1 < 0){
    		System.out.println(num1 + " es negativo.");
    	}
    	else {
    		System.out.println(num1 + " es nulo.");
    	}
    }
}