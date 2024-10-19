import java.util.ArrayList;
import java.util.List;

public class EjercicioTres {
    public static void main(String[] args) {
        //Crear lista
        List<Integer> listEnteros = new ArrayList<>();

        //Agregar elementos
        listEnteros.add(1);
        listEnteros.add(2);
        listEnteros.add(3);
        listEnteros.add(4);
        listEnteros.add(5);
        listEnteros.add(6);
        listEnteros.add(7);
        listEnteros.add(8);
        listEnteros.add(9);
        listEnteros.add(10);

        //nueva lista donde se guardaran los enteros
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        //Filtrar numeros pares
        for (int entero : listEnteros) {
            if (entero % 2 == 0) {
                evenNumbers.add(entero);
            }
        }

        // Imprimir la lista normal
        System.out.println("Lista con todos los numeros: " + listEnteros);

        // Imprimir la lista de los numeros pares
        System.out.println("Lista con los numeros pares: " + evenNumbers);



    }
}
