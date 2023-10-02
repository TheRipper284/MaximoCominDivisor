package MCD;
import java.util.Scanner;

public class MCDRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer valor: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo valor: ");
        int num2 = sc.nextInt();
        
        int mcd = calcularMCD(num1, num2);
        
        System.out.println("El MCD de " + num1 + " y " + num2 + " es " + mcd);
    }

    ///MCD o mcd es => es maximo comun divisor
    
    public static int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMCD(b, a % b);
        }
    }
}
