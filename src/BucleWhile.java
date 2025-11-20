void main(){
    int contador = 0;
    while (contador < 3){
        contador++;
        if (contador == 1){
            IO.println("Piedra");
        } else if (contador == 2){
            IO.println("Papel");
        } else if (contador == 3){
            IO.println("Tijeras");
        }
    }


    /*while (contador < 3){
        contador++;
        IO.println("Contador "+contador);
    }*/
}