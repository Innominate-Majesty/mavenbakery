package sjcc;


import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Cupcake> cupcakes = JSONFile.readCupcakes("cupcake_3906.json");

        //sorting the Array
        List<Cupcake> sortedCupcakes = Sorters.insertionSort(cupcakes);

        //Printing the sorted cupcakes
        for (Cupcake cupcake : sortedCupcakes) {
            System.out.println(cupcake);
        }
    }
}
