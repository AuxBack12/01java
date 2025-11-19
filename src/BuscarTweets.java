import java.util.Scanner;

public class BuscarTweets {
    void main(){
        Scanner buscar = new Scanner(System.in);
        IO.println("Ingrese una celebridad (de una sola palabra)...");
        String celebridad = buscar.nextLine();
        IO.println("https://twitter.com/search?q="+celebridad);
    }
}
