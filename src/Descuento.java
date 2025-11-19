import java.util.Scanner;

public class Descuento {
    void main(){
        Scanner dinero = new Scanner(System.in);
        Scanner descuento = new Scanner(System.in);
        IO.println("Ingrese el precio");
        double precioOriginal = dinero.nextDouble();
        IO.println("Ingrese el descuento");
        double porcentaje = descuento.nextDouble();
        double precioTotal = precioOriginal - (precioOriginal * porcentaje / 100);
        IO.println("Total a pagar: "+precioTotal);
    }
}
