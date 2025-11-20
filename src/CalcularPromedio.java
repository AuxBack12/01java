import java.util.Scanner;

public class CalcularPromedio {
    void main(){
        Scanner teclado = new Scanner(System.in);
        IO.println("Ingrese el primer número");
        double num1 = teclado.nextInt();
        IO.println("Ingrese el segundo número");
        double num2 = teclado.nextInt();
        IO.println("Ingrese el tercer número");
        double num3 = teclado.nextInt();
        double promedio = (num1+num2+num3)/3;
        IO.println("El promedio es: "+promedio);
    }
}