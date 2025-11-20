import java.util.Scanner;

    void main(){
        Scanner teclado = new Scanner(System.in);
        IO.println("Ingrese el primer número");
        int num1 = teclado.nextInt();
        IO.println("Ingrese el segundo número");
        int num2 = teclado.nextInt();
        IO.println("Ingrese el tercer número");
        int num3 = teclado.nextInt();

        if (num1 > num2 && num1 > num3) {
           if (num2 > num3){
               IO.println("El número mayor es: "+num1+" y el número menor es "+num3);
           } else{
               IO.println("El número mayor es: "+num1+" y el número menor es "+num2);
           }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3){
                IO.println("El número mayor es: "+num2+" y el número menor es "+num3);
            } else{
                IO.println("El número mayor es: "+num2+" y el número menor es "+num1);
            }
        }  else if (num3 > num1 && num3 > num2) {
            if (num1 > num2){
                IO.println("El número mayor es: "+num3+" y el número menor es "+num2);
            } else{
                IO.println("El número mayor es: "+num2+" y el número menor es "+num1);
            }
        }
    }

