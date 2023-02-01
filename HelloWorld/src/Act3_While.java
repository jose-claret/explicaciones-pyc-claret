import java.util.Scanner;

public class Act3_While {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Ingrese el numero de empleados:");
    	int n;
    	int i = 1;
    	int menor300 = 0;
    	int mayor300 = 0;
    	int currentSalario;
    	int total = 0;
    	n = teclado.nextInt();
    	System.out.print("Ingrese el el sueldo de cada empleado, recuerda que oscilan entre los 100 y 500 €:");
    	while (i <= n)
    	{
    		currentSalario = teclado.nextInt();
    		if (currentSalario <= 300)
    		{
    			menor300++;
    		}
    		else
    		{
    			mayor300++;
    		}
    		total += currentSalario;
    		i++;
    	}
    	
    	System.out.print("Hay " + menor300 + " que tienen un salario de entre los 100 y 300 €. Hay " + mayor300 + 
    			" que tienen un salario mayor que 300€. Además, la empresa invierte " + total + " en sueldos a los empleados.");
    }
}