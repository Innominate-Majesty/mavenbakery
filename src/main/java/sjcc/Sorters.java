package sjcc;

import java.util.List;

public class Sorters {
    
    public static List<Cupcake> insertionSort(List<Cupcake> cupcakes) {
        for (int i = 1; i < cupcakes.size(); i++) {

            Cupcake key = cupcakes.get(i);
            int j = i - 1;

            while (j >= 0 && cupcakes.get(j).getName().compareTo(key.getName()) > 0) {
                cupcakes.set(j + 1, cupcakes.get(j));
                j = j - 1;
            }
            cupcakes.set(j+ 1, key);
        }
        return cupcakes;
    }
}
