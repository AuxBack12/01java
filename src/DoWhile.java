void main(){
    int[] numeros = new int[5];
    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    int contador = 0;
    do {
        IO.println("Ingrese un número entero");
        numero = scanner.nextInt();
        numeros[contador] = numero;
        contador++;
    }while (contador < numeros.length);

    contador = 0;
    do {
        IO.println(numeros[contador]);
        contador++;
    }while (contador < numeros.length);
}
