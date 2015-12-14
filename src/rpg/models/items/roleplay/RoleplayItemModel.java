package rpg.models.items.roleplay;

import rpg.models.items.ItemModel;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class RoleplayItemModel extends ItemModel {

    public RoleplayItemModel(String name, int maxStackSize, int stackSize) {
        super(name, maxStackSize, stackSize);
    }

    public RoleplayItemModel(String name, int maxStackSize) {
        super(name, maxStackSize);
    }

}
