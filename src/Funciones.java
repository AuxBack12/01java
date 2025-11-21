void main(){
    int[] numeros = new int[5];
    cargarNumeros(numeros);
    mostrarNumeros(numeros);
}

private static void cargarNumeros(int[] numeros) {
    for (int i = 0; i < numeros.length; i++){
        int numero = UsuarioCargaNumeros();
        numeros[i] = numero;
    }
}

private static void mostrarNumeros(int[] numeros){
    IO.println("Los números ingresados son:");
    for (int numero : numeros) {
        IO.println(numero);
    }
}

private static int UsuarioCargaNumeros(){
    Scanner scanner= new Scanner(System.in);
    IO.println("Ingrese un número");
    return scanner.nextInt();
}