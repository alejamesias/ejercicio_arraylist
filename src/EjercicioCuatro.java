import java.util.ArrayList;
import java.util.List;

public class EjercicioCuatro {
    public static void main(String[] args) {
        //Crear lista 1
        List<String> list1 = new ArrayList<>();

        //Agregar elementos
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

       //Crear lista 2
        List<String> list2 = new ArrayList<>();

        //Agregar elementos
        list2.add("Banana");
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        //Crear lista para guardar los elementos en comun
        List<String> commonElements = new ArrayList<>();


        //elementos en comun
        for (String elementoEnComun : list1) {
            if (list2.contains(elementoEnComun)) {
                commonElements.add(elementoEnComun);
            }
        }

        //imprimir elementos
        System.out.println("Los elementos que hay en comun son: " + commonElements);

        }
}
