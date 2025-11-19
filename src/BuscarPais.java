import java.util.Scanner;

public class BuscarPais {
    void main(){
        Scanner buscar = new Scanner(System.in);
        IO.println("QUe país desea buscar en Google Maps");
        String busqueda = buscar.nextLine();
        IO.println("https://www.google.com/maps/search/"+busqueda);
    }
}
