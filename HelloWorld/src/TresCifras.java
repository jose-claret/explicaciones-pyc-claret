import java.util.Scanner;

public class TresCifras {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el valor del número de hasta tres cifras para saber su número de cifras:");
    	float num1;
    	num1 = teclado.nextInt();
    	
    	if (num1 >= 1000) {
    		System.out.println(num1 + " no es un número válido.");
    	}
    	else if (num1 > 100) {
    		System.out.println(num1 + " tiene 3 cifras.");
    	}
    	else if (num1 > 10){
    		System.out.println(num1 + " tiene 2 cifras.");
    	}
    	else{
    		System.out.println(num1 + " tiene 1 cifras.");
    	}
    }
}