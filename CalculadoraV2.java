import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculadoraV2{
    public static void main (String[] args){
        Scanner jade = new Scanner(System.in);
        int opcion = 5;
        // Bucle code
        do {
            // main code
            System.out.println("\n### __ CALCULADORA __ ###");
            System.out.print("\nIngresa primer numero: ");
            float numero1 = jade.nextFloat();
            System.out.print("Ingresa segundo numero: ");
            float numero2 = jade.nextFloat();
            System.out.println("\n1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicacion");
            System.out.println("4) Divicion");
            System.out.println("0) Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = jade.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("\n El resultado es: "+operaciones(numero1, numero2, '+'));
                    break;
                case 2:
                    System.out.println("\n El resultado es: "+operaciones(numero1, numero2, '-'));
                    break;
                case 3:
                    System.out.println("\n El resultado es: "+operaciones(numero1, numero2, '*'));
                    break;
                case 4:
                    System.out.println("\n El resultado es: "+operaciones(numero1, numero2, '/'));
                    break;
            }
     
            /*
            // Excepcion por si el usuario ingresa un valor no numerico
            try{
                System.out.println("\n¿Desearia hacer alguna otra operacion? s/n");
                opcion = jade.nextInt();
            } catch (InputMismatchException errorsini){
                System.out.println("¡Error!, El valor ingresado no es valido");
                System.exit(0);
            }
            */
        } while (opcion != 0);
    }

    // Metodo que podemos reutilizar para realizar las operaciones

    public static float operaciones(float numero1, float numero2, char operador){
        if(operador == '+'){
            return (numero1 + numero2);
        }
        else if (operador == '-'){
            return (numero1 - numero2);
        }
        else if (operador == '*'){
            return (numero1 * numero2);
        }
        else if (operador == '/'){
            return (numero1 / numero2);
        }
        else{
            return 0;
        }
    }
}