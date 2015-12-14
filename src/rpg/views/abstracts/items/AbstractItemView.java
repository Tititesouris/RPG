package rpg.views.abstracts.items;

import rpg.models.items.ItemModel;
import rpg.models.Model;
import rpg.views.abstracts.View;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public abstract class AbstractItemView extends View {

    public AbstractItemView(Model model) {
        super(model);
    }

    public abstract void use();

    @Override
    protected ItemModel getModel() {
        return (ItemModel) model;
    }

}
