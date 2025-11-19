void main() {
    try (Scanner cargarDatos = new Scanner(System.in)) {

        IO.println("Ingrese su peso en kilogramos");
        double peso = cargarDatos.nextDouble();
        IO.println("Ingrese su altura en metros");
        double altura = cargarDatos.nextDouble();

        double indiceMasaCorporal=peso /(altura * altura);
        IO.println(indiceMasaCorporal);
        //Mayor a 30 -> Obesidad
        if (indiceMasaCorporal > 30){
            IO.println("Estás super marrano, cuidate baby");
        }
        //Entre 25 y 30 -> Sobrepeso
        if (indiceMasaCorporal >= 25 && indiceMasaCorporal <= 30){
            IO.println("Estás obeso valedor");
        }
        //Entre 18.5 y 25 -> normal
        if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal <= 25){
            IO.println("Estás super chikistrikis");
        }
        //Menor a 18.5 -> Peso por debajo de lo normal
        if (indiceMasaCorporal < 18.5){
            IO.println("Estás super desnutrido flaco, cuidate baby");
        }
    }
}
