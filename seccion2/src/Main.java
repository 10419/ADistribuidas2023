import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

      List<String> ciudades = new ArrayList<>();
        ciudades.add("Bogota");
        ciudades.add("Medellin");
        ciudades.add("Bucaramanga");
        ciudades.add("Cali");
        ciudades.add("Pereira");
        ciudades.add("Ibague");
        ciudades.add("Cartagena");
        for ( int i=0; i<ciudades.size(); i++) {
            System.out.println(ciudades.get(i));
        }
        System.out.println();
        for (String ciudad:ciudades){
            System.out.println(ciudad);
        }
        System.out.println();
        ciudades.stream().forEach(s -> System.out.println(s));

        System.out.println();
        ciudades.stream().parallel().forEach(s -> System.out.println(s));
        System.out.println();

        System.out.println("Hello world!");

    }
}