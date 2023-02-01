import java.util.Scanner;

public class Ej7_While {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el numero de números que va a introducir:");
    	int n;
    	int i = 1;
    	int npares = 0;
    	int nimpares = 0;
    	int currentNumero;
    	n = teclado.nextInt();
    	System.out.print("Ahora ingrese el valor de cada número:");
    	while (i <= n)
    	{
    		currentNumero = teclado.nextInt();
    		if (currentNumero % 2 == 0)
    		{
    			npares++;
    		}
    		else
    		{
    			nimpares++;
    		}
    		i++;
    	}
    	
    	System.out.print("De los numeros introducidos, hay " + npares + " numeros pares y " + nimpares + " impares.");
    }
}