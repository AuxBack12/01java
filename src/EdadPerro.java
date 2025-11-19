import java.util.Scanner;

public class EdadPerro {
    void main(){
        Scanner edadPerro = new Scanner(System.in);
        IO.println("Ingrese la edad de su perrhijo");
        Integer añosPerroEnHumano = edadPerro.nextInt();
        Integer resultado = añosPerroEnHumano * 7;
        IO.println("La equivalencia de años perro en humano es: " + resultado);

    }
}
