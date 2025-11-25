void main() {
    /*
    long sumatoria=0;
    long max = 6;
    for(long i = 1; i < max; i++){
        long cuadrado = i*i;
            if (Math.sqrt(cuadrado) % 2 != 0){
                sumatoria += cuadrado;
                IO.println("La suma de numeros cuadrados impares es: "+sumatoria);
            }
    }
    */

    BigInteger sumatoria = BigInteger.ONE;
    BigInteger max = new BigInteger("895000");  // número enorme

    for (BigInteger i = BigInteger.ONE; i.compareTo(max) < 0; i = i.add(BigInteger.ONE)) {
        BigInteger cuadrado = i.multiply(i);
        // Para saber si la raíz es impar:
        // sqrt solo sirve para long, así que revisamos si i es impar
        if (i.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
            sumatoria = sumatoria.add(cuadrado);
        }
    }

    System.out.println("La suma de numeros cuadrados impares es: " + sumatoria);
}
