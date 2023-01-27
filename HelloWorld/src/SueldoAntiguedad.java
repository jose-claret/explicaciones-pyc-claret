import java.util.Scanner;
public class SueldoAntiguedad {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el sueldo y los años de antiguedad.");
    	float sueldo, años;
    	double aumento;
    	sueldo = teclado.nextInt();
    	años = teclado.nextInt();
    	
    	if (sueldo < 500) {
    		if (años >= 10) {
    			aumento = sueldo * 0.2;
    		}
    		else
    		{
    			aumento = sueldo * 0.05;
    		}
    		sueldo += aumento;
    		System.out.println("El sueldo aumenta a " + sueldo);
    	}
    	
    	if (sueldo >= 500) {
    		System.out.println("El sueldo sigue siendo " + sueldo);
    	}
    }
}