import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {
    public static void main(String[] args) {
        //Crear lista
        List<Integer> listNumbers = new ArrayList<>();

        //Agregar elementos
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        listNumbers.add(5);

        //Imprimir con un bucle for
        System.out.println("Imprimir los numeros con for");
        for (int i = 0; i < listNumbers.size(); i++) {
            System.out.println(listNumbers.get(i));
        }

        //Imprimir con for each
        System.out.println("Imprimir los numeros con for each");
        for (int number : listNumbers) {
            System.out.println(number);
            }

        //Imprimir con While de manera inversa
        int inverso = listNumbers.size() - 1; // Comenzar desde el último índice
        System.out.println("Imprimir los numeros en orden invertido");
        while (inverso >= 0) {
            System.out.println(listNumbers.get(inverso));
            inverso--;
        }

    }
}
