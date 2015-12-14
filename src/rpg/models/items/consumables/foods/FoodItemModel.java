package rpg.models.items.consumables.foods;

import rpg.models.items.consumables.ConsumableItemModel;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class FoodItemModel extends ConsumableItemModel {

    public FoodItemModel(String name, int maxStackSize, int stackSize, int health) {
        super(name, maxStackSize, stackSize, health);
    }

    public FoodItemModel(String name, int maxStackSize, int health) {
        super(name, maxStackSize, health);
    }

}
