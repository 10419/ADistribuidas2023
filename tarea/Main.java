import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    
    public static class Persona {
        private String nombre;
        private String sexo;
        
        public Persona(String nombre, String sexo) {
            this.nombre = nombre;
            this.sexo = sexo;  
        }
        
        public String getNombre() {
            return nombre;
        }
        
        public String getSexo() {
            return sexo;
        }
        
    }
    
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "M"));
        personas.add(new Persona("Maria", "F"));
        personas.add(new Persona("Luis", "M"));
        personas.add(new Persona("Ana", "F"));
        personas.add(new Persona("Gabriel", "M"));
        personas.add(new Persona("Juana", "F"));
        personas.add(new Persona("Leonel", "M"));
        personas.add(new Persona("Maria", "F"));
        personas.add(new Persona("Juan", "M"));
        personas.add(new Persona("Maricarmen", "F"));
        personas.add(new Persona("Manuel", "M"));
        personas.add(new Persona("Cecilla", "F"));
        personas.add(new Persona("Tomas", "M"));
        personas.add(new Persona("Flor", "F"));
        personas.add(new Persona("Frank", "M"));
        personas.add(new Persona("Fernanda", "F"));
        
        List<Persona> hombres = personas.stream()
                                        .filter(p -> p.getSexo().equals("M"))
                                        .collect(Collectors.toList());
        long startTime = System.currentTimeMillis();
        hombres.forEach(p -> System.out.println(p.getNombre()));
        long endTime = System.currentTimeMillis();
        
        System.out.println("Tiempo de ejecución con programación secuencial: " + (endTime - startTime) + " ms");

        List<Persona> hombres1 = personas.parallelStream()
                                        .filter(p -> p.getSexo().equals("M"))
                                        .collect(Collectors.toList());
        long startTime1 = System.currentTimeMillis();
        hombres1.forEach(p -> System.out.println(p.getNombre()));
        long endTime1 = System.currentTimeMillis();
        
        System.out.println("Tiempo de ejecución con programación paralela: " + (endTime1 - startTime1) + " ms");
    }
}