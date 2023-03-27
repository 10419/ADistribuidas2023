import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> dataurl = new ArrayList<>();
        dataurl.add("https://upeu.edu.pe/");
        dataurl.add("https://upeu.edu.pe/fsalud/");
        dataurl.add("https://upeu.edu.pe/fia/");
        dataurl.add("https://upeu.edu.pe/fce/");
        dataurl.add("https://upeu.edu.pe/fsalud/enfermeria/");
        dataurl.add("https://upeu.edu.pe/fsalud/personal-administrativo/");
        dataurl.add("https://upeu.edu.pe/fsalud/enfermeria/");
        long timehome= System.nanoTime();
        dataurl.stream().forEach(s -> System.out.println(obtenerpagina(s)));
        long timeend = (System.nanoTime());
        System.out.println();
        System.out.println("Tiempo sin programacion paralela "+(timeend-timehome)/1_000_000_000);

        timehome= System.nanoTime();
        dataurl.stream().parallel().forEach(s -> obtenerpagina(s));
        timeend= System.nanoTime();
        System.out.println();
        System.out.println("Diferencia de tiempo con paralelismo "+(timeend-timehome)/1_000_000_000);


    }
    private static String obtenerpagina(String dataurl) {
        try {
            URL url = new URL(dataurl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            Stream<String> lineas = new BufferedReader(new InputStreamReader(inputStream)).lines();
            return lineas.collect(Collectors.joining());
            //.collect(Collectors.joining())

        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
        return "";
    }

}