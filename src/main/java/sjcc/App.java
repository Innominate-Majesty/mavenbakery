package sjcc;


import java.util.List;

public class App 
{
    public static void main( String[] args )
    {

        //Read cupcakes from the JSON file
        JSONArray jsonArray = JSONFile.readArray(src/main/java/sjcc/cupcake_3906.json);

        //converting JSONArray to List<Cupcake>
        List<Cupcake> cupcakes = convertJsonArrayToCupcakesList(jsonArray);

        //sorting the array
        List<Cupcake> sortedCupcakes = CupcakeSorter.insertionSort(cupcakes);

        //printing sorted cupcakes
        for (Cupcake cupcake : sortedCupcakes) {
            System.out.println(cupcake);
        }
    }
    
    private static List<Cupcake> convertJsonArraytoCupcakesList(JSONArray jsonArray) {

        return null;
    }
}
