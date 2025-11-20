void main (){

    int mayor = 0;
    int menor = 0;
    int[] numeros = new int[5];
    Scanner scanner = new Scanner(System.in);
    for (int contador = 0; contador < numeros.length; contador++){
        IO.println("Ingrese un número");
        numeros[contador] = scanner.nextInt();
    }

    IO.println("Los números ingresados son: ");
    for (int contador = 0; contador < numeros.length; contador++){
        IO.println(numeros[contador]);
    }

    for (int contador = 0; contador < numeros.length; contador++){
        int num = numeros[contador];
        if (num >= mayor || contador == 0){
            mayor = num;
        }
        if (num <= menor || contador == 0){
            menor = num;
        }
    }
    IO.println("El número mayor es: "+mayor);
    IO.println("El número menor es: "+menor);

    int sumatoria = 0;
    for (int contador = 0; contador < numeros.length; contador++){
        int numero = numeros[contador];
        sumatoria += numero;
    }
    float promedio = (float) sumatoria/numeros.length;
    IO.println("El promedio es "+promedio);

}