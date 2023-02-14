import java.util.Scanner;

public class Act1StringCadenas {
	@SuppressWarnings("resource")
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
        String nombre1,nombre2;
        int edad1,edad2;
        
        System.out.print("Ingrese el nombre y edad: ");
        nombre1=teclado.next();
        edad1=teclado.nextInt();
        
        System.out.print("Ingrese el nombre y edad: ");
        nombre2=teclado.next();
        
        edad2=teclado.nextInt();
        System.out.print("La persona de mayor edad es: ");
        
        if (edad1>edad2) {
            System.out.println(nombre1);
        } else {
            System.out.println(nombre2);
        }
        
	}  	
}