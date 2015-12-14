package rpg.models.items.consumables.drinks;

import rpg.models.items.consumables.ConsumableItemModel;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class DrinkItemModel extends ConsumableItemModel {

    public DrinkItemModel(String name, int maxStackSize, int stackSize, int health) {
        super(name, maxStackSize, stackSize, health);
    }

    public DrinkItemModel(String name, int maxStackSize, int health) {
        super(name, maxStackSize, health);
    }

}
