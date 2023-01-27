import java.util.Scanner;

public class SumaYProducto {
    @SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.println("Ingrese el valor de los números que desea sumar:");
    	int num1, num2, num3, num4, sum, product;
    	num1 = teclado.nextInt();
    	num2 = teclado.nextInt();
    	num3 = teclado.nextInt();
    	num4 = teclado.nextInt();
    	sum = num1 + num2;
    	product = num3 * num4;
    	System.out.println("La suma es " + sum + " y el producto es " + product);
    }
}
