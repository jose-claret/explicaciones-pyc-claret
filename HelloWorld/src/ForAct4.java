import java.util.Scanner;

public class ForAct4 {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el numero (del 1 al 10) del que desea saber su tabla de multiplicar:");
    	
    	int n;
    	n = teclado.nextInt();
    	
    	System.out.println("La tabla de multiplicar es:");
    	for (int i = 1; i < 12; i++)
    	{
    		System.out.println(n * i);
        }
    	
	}  	
}