package rpg.models.items;

import rpg.models.Model;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class ItemModel extends Model {

    protected String name;

    protected int maxStackSize;

    protected int stackSize;

    public ItemModel(String name, int maxStackSize, int stackSize) {
        this.name = name;
        this.maxStackSize = maxStackSize;
        this.stackSize = stackSize;
    }

    public ItemModel(String name, int maxStackSize){
        this(name, maxStackSize, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxStackSize() {
        return maxStackSize;
    }

    public void setMaxStackSize(int maxStackSize) {
        this.maxStackSize = maxStackSize;
    }

    public int getStackSize() {
        return stackSize;
    }

    public void setStackSize(int stackSize) {
        this.stackSize = stackSize;
    }

}
