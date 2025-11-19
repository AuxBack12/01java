import java.util.Scanner;

public class Whastapp {
    void main(){
        Scanner buscar = new Scanner(System.in);
        IO.println("Ingrese el número sin espacios al que desea llamar....");
        String llamar = buscar.nextLine();
        IO.println("https://api.whatsapp.com/send?phone="+llamar);
    }
}
