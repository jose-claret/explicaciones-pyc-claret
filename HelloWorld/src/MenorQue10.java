import java.util.Scanner;

public class MenorQue10 {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el valor del número de hasta tres cifras para saber su número de cifras:");
    	float num1, num2, num3;
    	num1 = teclado.nextInt();
    	num2 = teclado.nextInt();
    	num3 = teclado.nextInt();
    	
    	if (num1 < 10 || num2 < 10 || num3 < 10) {
    		System.out.println("Algún número es menor que 10.");
    	}
    	else {
    		System.out.println("Todos son mayores que 10.");
    	}
    }
}