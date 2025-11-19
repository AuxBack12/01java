import java.util.Scanner;

public class EscogerAventura {
    void main(){
        Scanner escoger = new Scanner(System.in);
        IO.println("Esta es la historia de un conejo blanco el cual se encontraba en una bosque a medio \n" +
                "día, inmediatamente vio un orificio en el suelo y una casa muy pequeña con una puerta \n" +
                "abierta, ¿Cual crees que escogio?\n" +
                "1) EL hoyo en el suelo\n" +
                "2) La puerta de la casa abandonada");

        int opcion1 = escoger.nextInt();
        if (opcion1 == 1){
            IO.println("Por fin el conejo blanco se pudo encontrar con su familia, ya\n" +
                    " que sufre de problemas de personalidad multiple, crees que el conejo.....\n" +
                    "1)Fue bien recibido por su familia despues de ausentarse 24 horas sin que nadie supiera nada de él\n" +
                    "2)Fue rechazado por todos los miembros de su familia");
            int opcion2 = escoger.nextInt();
            if (opcion2 == 1){
                IO.println("EL conejo blanco abandono a su familia por pinche aburrida, FIN");
            }else if(opcion2 == 2){
                IO.println("El conejo salio por conejitas al bosque, formo nuevas familias\n" +
                        "y tenia un control autoritario sobre el barrio en el que vive, FIN");
            }
        } else if (opcion1 == 2) {
            IO.println("EL conejo blanco entro en una guarida de narcotraficantes, donde la mera verdura\n" +
                    " es el mismisimo conejo blanco como jefe de la mafia rusa, crees que ..........\n" +
                    "1)Continuo fabricando meta para vender al resto de animales silvestres\n" +
                    "2)Abandono el negocio para formar una familia y alejarse de la vida loca");
            int opcion3 = escoger.nextInt();
            if (opcion3 == 1){
                IO.println("Por supuesto que escogio el lado de fabricar billetes y tener una comunidad\n" +
                        "libre de corruptos como los politicos y policias");
            }else if (opcion3 == 2){
                IO.println("Como crees que abandonar un proyecto asi de la nada tiene\nbeneficios, no mames estas mal de la cabeza ve al medico, FIN");
            }
        }
    }
}