import java.util.Scanner;

public class DoWhileAct1 {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	int n, suma;
    	System.out.println("Ingrese los valores de los que desea saber la suma, introduzca 9999 para parar:");
    	suma = 0;
    	n = 0;
    	
    	do
    	{
    		if (n != 9999)
    		{
            	n = teclado.nextInt();
            	suma = suma + n;
    		}
    	}while (n != 9999);

    	
    	System.out.println("La suma total es " + suma);
    	
    	if (suma > 0)
    	{
        	System.out.println("La suma es mayor que 0");
    	} else if (suma < 0)
    	{
        	System.out.println("La suma es menor que 0");
    	}
    	else {
        	System.out.println("La suma es igual a 0");
    	}
    	

    }
}