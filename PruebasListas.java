import java.util.ArrayList;

/* @Author: EV3TH */

public class PruebasListas{
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("platano");
        frutas.add("fresa");
        frutas.add("naranja");
        frutas.add("pera");
        frutas.add("sandia");
        frutas.add("papaya");
        
        // recorremos la lista
        boolean encontrado = false;
        for (String i : frutas){
            // validamos que la fruta exista en la lista
            if (i.equals("papaya")){
                encontrado = true;
                System.out.println("\nFruta " + i + " encontrada!");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\n¡ERROR!, Fruta no encontrada");
        }
        

    }
}