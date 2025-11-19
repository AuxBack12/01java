import java.util.Scanner;

public class AdivinarNumero {
    void main(){
        Scanner adivina = new Scanner(System.in);
        Integer numeroAleatorio = (int) (Math.random() * 100);
        IO.println("Adivina en que número estoy pensando.......  ("+ numeroAleatorio +")");
        Integer numero = adivina.nextInt();

        if (numero == numeroAleatorio){
            IO.println("Eres la Gaver");
        }else {
            IO.println("Si estás bien pendejo");
        }

    }
}
