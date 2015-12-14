package rpg.controllers.items;

import rpg.controllers.Controller;
import rpg.models.items.ItemModel;
import rpg.views.abstracts.items.AbstractItemView;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class ItemController extends Controller {

    public ItemController(ItemModel model, AbstractItemView view) {
        super(model, view);
    }

    public void use() {

    }

    @Override
    public void update() {

    }

    @Override
    protected ItemModel getModel() {
        return (ItemModel) model;
    }

    @Override
    protected AbstractItemView getView() {
        return (AbstractItemView) view;
    }

}
