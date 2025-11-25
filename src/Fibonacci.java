void main(){

    int limite = 4_000_000;

    // Lista para almacenar solo los Fibonacci pares
    List<Integer> pares = new ArrayList<>();

    int e1 = 2;   // primer Fibonacci par
    int e2 = 8;   // segundo Fibonacci par

    pares.add(e1);
    pares.add(e2);

    // Generar la secuencia de Fibonacci PAR hasta el límite
    while (true) {
        int siguiente = 4 * e2 + e1;  // fórmula optimizada

        if (siguiente > limite) break;

        pares.add(siguiente);

        e1 = e2;
        e2 = siguiente;
    }

    // Paralelizar la suma
    int suma = pares.parallelStream()
            .mapToInt(Integer::intValue)
            .sum();

    System.out.println("Suma paralelizada: " + suma);
    /*
    BigInteger starts = BigInteger.ZERO;
    BigInteger ends = BigInteger.ONE;
    BigInteger sumatoria = BigInteger.ZERO;
    BigInteger limite = new BigInteger("4000000");
    for (BigInteger vuelta = BigInteger.ZERO; vuelta.compareTo(limite) < 0; vuelta = vuelta.add(BigInteger.ONE)) {
        BigInteger residuo = starts.mod(ends);
        if (residuo.equals(BigInteger.ZERO)) {
            sumatoria = starts.add(ends);
            starts = ends;
            ends = sumatoria;
        }

    }
    IO.println(sumatoria);
    */
/*
    int starts = 0;
    int ends = 1;
    int max = 10;
    int sumatoria = 0;
    for (int vuelta = 1; vuelta <= max ; vuelta++) {
        sumatoria = starts + ends;
        starts = ends;
        ends = sumatoria;
        IO.println("numero fibonacci: "+sumatoria);
        if (sumatoria%2 == 0){
            IO.println("suma total: "+sumatoria);
        }
    }*/
}