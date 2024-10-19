import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjercicioSeis {
    public static void main(String[] args) {

        //Crear Lista
        List<String> listCiudades = new ArrayList<>();

        //Agregar datos
        listCiudades.add("Pereira");
        listCiudades.add("Cartagena");
        listCiudades.add("Barrancabermeja");
        listCiudades.add("Santa Marta");
        listCiudades.add("Bucaramanga");

        //lista sin mezclar
        System.out.println("La lista sin mezclar es: " +listCiudades);

        //mezclar lista
        Collections.shuffle(listCiudades);

        //lista mezclada
        System.out.println("La lista mezclada " +listCiudades);


    }
}
