package sjcc;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class App {
    public static void main(String[] args) {
        URL resource = App.class.getClassLoader().getResource("cupcake_3906.json");
        if (resource != null) {
            String filePath = resource.getPath();
            List<Cupcake> cupcakes = JSONFile.readCupcakes(filePath);

            //sorting the Array
            List<Cupcake> sortedCupcakes = Sorters.insertionSort(cupcakes);

            //Updating the id of each cupcake to reflect its position in the new Array
            for (int i = 0; i < sortedCupcakes.size(); i++) {
                sortedCupcakes.get(i).setId(i + 1);
            }

            System.out.println("ID                            Name                      Price             Frosting");
            System.out.println("_______________________________________________________________________________________________________________");


            //Printing the sorted cupcakes
            double totalPrice = 0;

            for (Cupcake cupcake : sortedCupcakes) {
                System.out.println(cupcake);
                totalPrice += cupcake.getPrice();
            }

            System.out.println("_______________________________________________________________________________________________________________");
            System.out.println("\n                                                Details");
            System.out.println("_______________________________________________________________________________________________________________");
            System.out.println("\nNumber of items : " + sortedCupcakes.size());
            System.out.printf("Average price : %.2f\n", totalPrice / sortedCupcakes.size());


        }
        else {
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