package sjcc;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        URL resource = App.class.getClassLoader().getResource("cupcake_3906.json");
        if (resource != null) {
            String filePath = resource.getPath();
            List<Cupcake> cupcakes = JSONFile.readCupcakes(filePath);


            //sorting the Array
            List<Cupcake> sortedCupcakes = Sorters.insertionSort(cupcakes);

            //Printing the sorted cupcakes
            for (Cupcake cupcake : sortedCupcakes) {
                System.out.println(cupcake);
            }
        } else {
            System.out.println("File not found!");
        }
    }

    private static List<Cupcake> convertJsonArrayToCupcakesList(JSONArray jsonArray) {
        List<Cupcake> cupcakes = new ArrayList<>();
        if (jsonArray != null) {
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                    Cupcake cupcake = new Cupcake(jsonObject);
                    cupcakes.add(cupcake);
                }
            }
        return cupcakes;
    }
}