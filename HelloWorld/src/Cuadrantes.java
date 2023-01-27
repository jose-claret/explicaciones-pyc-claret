import java.util.Scanner;
public class Cuadrantes {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese las dos coordenadas del punto para analizar el cudrante en el que cae.");
    	float x, y;
    	x = teclado.nextInt();
    	y = teclado.nextInt();
    	
    	if (x > 0 & y > 0) {
    		System.out.println("El punto se encuentra en el primer cuadrante.");
    	}
    	if (x < 0 & y > 0) {
    		System.out.println("El punto se encuentra en el segundo cuadrante.");
    	}
    	if (x < 0 & y < 0) {
    		System.out.println("El punto se encuentra en el tercer cuadrante.");
    	}
    	if (x > 0 & y < 0) {
    		System.out.println("El punto se encuentra en el cuarto cuadrante.");
    	}
    }
}