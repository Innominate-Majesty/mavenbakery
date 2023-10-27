package sjcc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.*;
import org.json.simple.parser.*;

public class JSONFile {

  //Read a JSON file and return an array of Cupcake objects
  public static List<Cupcake> readCupcakes(String fileName) {
    JSONParser jsonParser = new JSONParser();
    List<Cupcake> cupcakes = new ArrayList<>();

    try (FileReader reader = new FileReader(fileName)) {
      Object obj = jsonParser.parse(reader);
      JSONArray cupcakeList = (JSONArray) obj;

      for (Object cupcakeObj : cupcakeList) {
        JSONObject cupcakeJSON = (JSONObject) cupcakeObj;
        Cupcake cupcake = parseCupcake(cupcakeJSON);
        cupcakes.add(cupcake);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    }

    return cupcakes;
  }
  
  //Parse JSONObject into a Cupcake object
  private static Cupcake parseCupcake(JSONObject cupcakeJSON) {
    int id = ((Long) cupcakeJSON.get("id")).intValue();
    String name = (String) cupcakeJSON.get("name");
    double price = (double) cupcakeJSON.get("price");
    List<String> frosting = (List<String>) cupcakeJSON.get("frosting");

    return new Cupcake(id, name, price, frosting);
  }

}
