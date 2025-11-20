void main(){
    //Hacer un programa donde el usuario ingresa 5 números y mostrarlos
    int[] numeros = new int[5];
    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    int contador = 0;
    while (contador < numeros.length){
        IO.println("Ingrese un número entero");
        numero = scanner.nextInt();
        numeros[contador] = numero;
        contador++;
    }

    contador = 0;
    while (contador < numeros.length){
        IO.println(numeros[contador]);
        contador++;
    }
}
