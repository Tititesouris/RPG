package rpg;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import com.sun.imageio.plugins.common.InputStreamAdapter;
import rpg.controllers.characters.CharacterController;
import rpg.models.characters.CharacterModel;
import rpg.models.items.consumables.foods.FoodItemModel;
import rpg.views.abstracts.characters.AbstractCharacterView;
import rpg.views.concretes.textual.characters.CharacterView;

import java.io.*;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class Main {

    public static void main(String[] args) {
        CharacterModel bob = new CharacterModel("Bob");
        AbstractCharacterView bobView = new CharacterView(bob);
        CharacterController bobController = new CharacterController(bob, bobView);
        CharacterModel paul = new CharacterModel("Paul");
        AbstractCharacterView paulView = new CharacterView(paul);
        CharacterController paulController = new CharacterController(paul, paulView);
        bobController.attack(paulController);

        try {
            /*FoodItemModel apple = new FoodItemModel("Apple", 100, 2);
            JsonWriter jsonWriter = new JsonWriter(new FileOutputStream("./res/items/consumables/foods/apple.json"));
            jsonWriter.write(apple);
            jsonWriter.close();*/
            JsonReader jsonReader = new JsonReader(new FileInputStream("./res/items/consumables/foods/apple.json"));
            FoodItemModel apple = (FoodItemModel) jsonReader.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
