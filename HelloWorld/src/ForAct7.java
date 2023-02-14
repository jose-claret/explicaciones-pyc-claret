import java.util.Scanner;
public class ForAct7 {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.println("Ingrese el numero 10 numeros enteros cualesquiera: ");
    	int negativos = 0;
    	int positivos = 0;
    	int multiplos = 0;
    	int valorPares = 0;
    	int n;
    	for (int i = 1; i <= 10; i++)
    	{
        	n = teclado.nextInt();
        	if (n < 0)
        		negativos++;
        	else if (n > 0)
        		positivos++;
        	if (n / 15 == 0)
        		multiplos++;
        	if (n % 2 == 0)
        		valorPares += n;
        }
    	System.out.println("Cantidad de numeros negativos ingresados: " + negativos);
    	System.out.println("Cantidad de numeros positivos ingresados: " + positivos);
    	System.out.println("Cantidad de multiplos de 15 ingresados: " + multiplos);
    	System.out.println("Valor de la suma de los numeros pares ingresados:: " + valorPares);
    	
	}  	
}
