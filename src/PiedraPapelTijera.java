import java.util.Random;
void main(){
    Scanner teclado = new Scanner(System.in);
    IO.println("Escoge \n(1) Piedra\n(2) Papel\n(3) Tijeras");
    String opcion = teclado.nextLine().toLowerCase();
    String[] juego = {"piedra", "papel", "tijeras"};
    Random rand = new Random();
    int indice = rand.nextInt(juego.length);
    String maquina = juego[indice];
    IO.println("Maquina: "+maquina);
    IO.println("Persona: "+opcion);

    if (maquina.equals("tijeras") && opcion.equals("papel") ){
        IO.println("Gana máquina");
    }else if (maquina.equals("papel") && opcion.equals("piedra")){
        IO.println("Gana máquina");
    }else if (maquina.equals("piedra") && opcion.equals("tijeras")){
        IO.println("Gana máquina");
    }else if (maquina.equals("tijeras") && opcion.equals("piedra")){
        IO.println("Gana persona");
    }else if (maquina.equals("papel") && opcion.equals("tijeras")){
        IO.println("Gana persona");
    } else if (maquina.equals("piedra") && opcion.equals("papel")) {
        IO.println("Gana persona");
    }else{
        IO.println("Empate");
    }
}