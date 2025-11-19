import java.util.Scanner;

public class KilometrosToMillas {
    void main(){
        Scanner distancia = new Scanner(System.in);
        IO.println("Ingrese la distancia en millas");
        double milla = distancia.nextDouble();
        double kilometro = milla * 1.609344;
        IO.println("La conversion de "+ milla+" milla(s) en kilometros es: " + kilometro);

    }
}
