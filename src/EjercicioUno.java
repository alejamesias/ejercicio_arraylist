import java.util.List;
import java.util.ArrayList;
public class EjercicioUno {
    public static void main(String[] args) {

        //Crear lista
        List<String> listFruits = new ArrayList<>();

        //Agregar elementos
        listFruits.add("Apple");
        listFruits.add("Banana");
        listFruits.add("Cherry");

        //Imprime tamaño y elementos
        System.out.println(listFruits.size());
        System.out.println(listFruits);


        //Eliminar banana
        listFruits.remove("Banana");

        //Cambiar valor de cherry a Orange
        listFruits.set(1, "Orange");

        //Imprime lista resultante
        System.out.println(listFruits);

    }
}
