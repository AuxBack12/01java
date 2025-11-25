void main(){

    String[] personas = {"Lucas Moy", "Pepito Pepito", "Juan Escutia", "Pedro Paramo", "Alejandro Perez", "Roberto Carlos"};
    /*
    String[] personas = new String[10];
    personas[0] = "Lucas Moy";
    personas[0] = "Pepito Pepito";
    personas[0] = "Juan Escutia";
    personas[0] = "Pedro Paramo";
    personas[0] = "Alejandro Perez";
    personas[0] = "Roberto Carlos";
     */
    Scanner scanner = new Scanner(System.in);
    IO.println("Ingrese su busqueda");
    String busqueda = scanner.nextLine();

    for (String nombrePersona:personas){
        if (nombrePersona.toLowerCase().contains(busqueda.toLowerCase())){
            IO.println("La persona si se encuentra en la lista y es: "+nombrePersona);
        }
    }
    /*
    for (int i = 0; i < personas.length; i++) {
        String personaEncontrada = personas[i];
        if (busqueda.equals(personaEncontrada)){
            IO.println("La persona si se encuentra en la lista y es: "+personaEncontrada);
        }
    }
     */

}