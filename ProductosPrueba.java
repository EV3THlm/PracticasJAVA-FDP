/*
 * @Author: EV3TH
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ProductosPrueba{

    private String nombre;
    private float precio;
    static float sumaTotal;

    public ProductosPrueba(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    // ____________ GETTERS __________
    
    public String getNombre(){
        return nombre;
    }

    public float getPrecio(){
        return precio;
    }

    public static void compra(ArrayList<ProductosPrueba>prueba, String tipoProducto, int cantidad){

        // Realizamos recorrido
        for (ProductosPrueba i: prueba){
            if (i.getNombre().equals(tipoProducto)){
                System.out.println("\n¡Compra realizada con exito!, por "+cantidad+" "+i.getNombre()+" = "+(i.getPrecio() * cantidad));
                sumaTotal += (i.getPrecio() * cantidad);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner jade = new Scanner(System.in);

        ArrayList<ProductosPrueba> productinis = new ArrayList<>();
        productinis.add(new ProductosPrueba("Leche", 15));
        productinis.add(new ProductosPrueba("Huevo", 50));
        productinis.add(new ProductosPrueba("Galletas", 20));
        productinis.add(new ProductosPrueba("Pan", 5));

        compra(productinis, "Leche", 2);
        compra(productinis, "Huevo", 2);
        
        /*
        // Compramos un producto
        for (Productos i: productinis){
            if(i.nombre.equals("Leche")){
                System.out.println("\nEl costo total de lo que compro es: "+(i.getPrecio() * 5));
                sumaTotal += (i.getPrecio() * 5);
            }
        }

        for (Productos i: productinis){
            if(i.nombre.equals("Huevo")){
                System.out.println("\nEl costo total de lo que compro es: "+(i.getPrecio() * 2));
                sumaTotal += (i.getPrecio() * 2);
            }
        }
        */

        System.out.println("\nPrecio total: "+sumaTotal);
    }   
}