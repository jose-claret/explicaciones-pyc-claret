import java.util.Scanner;

public class PromocionONo {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el valor de las tres notas para saber si promociona o no:");
    	float num1, num2, num3, promedio, sum;
    	num1 = teclado.nextInt();
    	num2 = teclado.nextInt();
    	num3 = teclado.nextInt();    	
    	sum = num1 + num2 + num3;
    	promedio = sum / 3;
    	
    	String cadenaSuma = "El promedio es:";
    	
    	if (promedio >= 7) {
    		System.out.println(cadenaSuma + " " + promedio + " y si promociona ");
    	}
    	else {
    		System.out.println(cadenaSuma + " " + promedio + " y no promociona ");
    	}
    }
}