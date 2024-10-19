import java.util.ArrayList;
import java.util.List;

public class EjercicioCinco {
    public static void main(String[] args) {

        //crear lista
        List<Integer> listEnteros = new ArrayList<>();

        //Agregar elementos
        listEnteros.add(1);
        listEnteros.add(2);
        listEnteros.add(3);
        listEnteros.add(4);
        listEnteros.add(5);

        //Convertir a integer la lista
        Integer[] listaConvertida = new Integer[listEnteros.size()];
        listaConvertida = listEnteros.toArray(listaConvertida); //toArray es un metodo para convertir la lista

        //imprimir
        System.out.println("Numeros enteros convertidos: ");
        for (int elemento = 0; elemento < listaConvertida.length; elemento++) {
            System.out.println(listaConvertida[elemento]);
        }

    }
}
