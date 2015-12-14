package rpg.views.concretes.textual.characters;

import rpg.models.characters.CharacterModel;
import rpg.models.items.ItemModel;
import rpg.models.items.consumables.ConsumableItemModel;
import rpg.models.items.consumables.drinks.DrinkItemModel;
import rpg.models.items.consumables.foods.FoodItemModel;
import rpg.views.abstracts.characters.AbstractCharacterView;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class CharacterView extends AbstractCharacterView {

    public CharacterView(CharacterModel model) {
        super(model);
    }

    public void attack(CharacterModel target, int damage) {
        CharacterModel me = getModel();
        System.out.println(me.getName() + " attacks " + target.getName() + " and does " + damage + " damage.");
    }

    public void miss(CharacterModel target) {
        CharacterModel me = getModel();
        System.out.println(me.getName() + " attacks " + target.getName() + " and misses.");
    }

    @Override
    public void use(ItemModel item) {
        if (item instanceof ConsumableItemModel) {
            if (item instanceof FoodItemModel)
                eat((FoodItemModel) item);
            else if (item instanceof DrinkItemModel)
                drink((DrinkItemModel) item);

        }
    }

    @Override
    public void eat(FoodItemModel food) {
        CharacterModel me = getModel();
        if (food.getHealth() > 0)
            System.out.println(me.getName() + " eats and regenerates " + food.getHealth() + " health.");
        else if (food.getHealth() < 0)
            System.out.println(me.getName() + " eats rotten food and loses " + food.getHealth() + " health.");
        else
            System.out.println(me.getName() + " eats. Yummy.");
    }

    @Override
    public void drink(DrinkItemModel drink) {
        CharacterModel me = getModel();
        if (drink.getHealth() > 0)
            System.out.println(me.getName() + " drinks and regenerates " + drink.getHealth() + " health.");
        else if (drink.getHealth() < 0)
            System.out.println(me.getName() + " drinks poison and loses " + drink.getHealth() + " health.");
        else
            System.out.println(me.getName() + " drinks. Hic.");
    }

}
