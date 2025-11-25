import java.math.BigInteger;
import java.util.Scanner;

public class BuscarPais {
    void main(){

        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("7");

        BigInteger residuo = a.mod(b);

        System.out.println("El residuo es: " + residuo);
    }
        /*
        Scanner buscar = new Scanner(System.in);
        String busqueda;
        IO.println("QUe país desea buscar en Google Maps");
        busqueda = buscar.nextLine();
        IO.println("https://www.google.com/maps/search/"+busqueda);
    }

         */
}
