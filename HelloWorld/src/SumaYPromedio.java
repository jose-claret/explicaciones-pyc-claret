import java.util.Scanner;

public class SumaYPromedio {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el valor de los cuatro números que desea sumar y saber el "
    			+ "promedio:");
    	float num1, num2, num3, num4, sum;
    	float promedio;
    	num1 = teclado.nextInt();
    	num2 = teclado.nextInt();
    	num3 = teclado.nextInt();    	num4 = teclado.nextInt();
    	sum = num1 + num2 + num3 + num4;
    	promedio = sum / 4;
    	String cadenaSuma = "La suma es";
    	System.out.println(cadenaSuma + " " + sum + " y el promedio es " + promedio);
    }
}
