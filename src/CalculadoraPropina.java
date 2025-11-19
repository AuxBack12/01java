import java.util.Scanner;

public class CalculadoraPropina {
    void main(){
        Scanner cuenta = new Scanner(System.in);
        Scanner propina = new Scanner(System.in);

        IO.println("Ingrese el total de su cuenta");
        double cuentaTotal = cuenta.nextDouble();

        IO.println("Ingrese el porcentaje de propina a dejar");
        double porcentaje = propina.nextDouble();

        double resultado = cuentaTotal * porcentaje / 100;

        IO.println("La propina es de "+resultado);
    }
}
