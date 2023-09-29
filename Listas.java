import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        
        // Creamos un ArrayList de String (solo cadenas)
        ArrayList<String> cars = new ArrayList<>();

        // Agregamos elementos al ArrayList
        cars.add("Challenger");
        cars.add("BMW");
        cars.add("Mercedes");

        // Hacemos el recorrido para imprimir el Arraylist
        for (String car : cars){
            System.out.println(car);
        }
    }
}
