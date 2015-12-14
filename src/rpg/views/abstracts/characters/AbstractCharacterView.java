package rpg.views.abstracts.characters;

import rpg.models.characters.CharacterModel;
import rpg.models.items.ItemModel;
import rpg.models.items.consumables.drinks.DrinkItemModel;
import rpg.models.items.consumables.foods.FoodItemModel;
import rpg.views.abstracts.View;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public abstract class AbstractCharacterView extends View {

    public AbstractCharacterView(CharacterModel model) {
        super(model);
    }

    public abstract void attack(CharacterModel target, int damage);

    public abstract void miss(CharacterModel target);

    public abstract void use(ItemModel item);

    protected abstract void eat(FoodItemModel item);

    protected abstract void drink(DrinkItemModel item);

    @Override
    public CharacterModel getModel() {
        return (CharacterModel) model;
    }

}
