package rpg.models.items.consumables;

import rpg.models.items.ItemModel;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class ConsumableItemModel extends ItemModel {

    private int health;

    public ConsumableItemModel(String name, int maxStackSize, int stackSize, int health) {
        super(name, maxStackSize, stackSize);
        this.health = health;
    }

    public ConsumableItemModel(String name, int maxStackSize, int health) {
        super(name, maxStackSize);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
