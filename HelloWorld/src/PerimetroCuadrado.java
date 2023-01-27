import java.util.Scanner;

public class PerimetroCuadrado {
    public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el valor del lado del cuadrado:");
    	int num, perimetro;
    	num = teclado.nextInt();
    	perimetro = num * 4;
    	System.out.println("El perimetro del cuadrado es " + perimetro);
    }
}
