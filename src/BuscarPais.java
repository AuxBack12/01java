import java.util.Scanner;

public class BuscarPais {
    void main(){
        Scanner buscar = new Scanner(System.in);
        String busqueda;
        IO.println("QUe país desea buscar en Google Maps");
        busqueda = buscar.nextLine();
        IO.println("https://www.google.com/maps/search/"+busqueda);
    }
}
