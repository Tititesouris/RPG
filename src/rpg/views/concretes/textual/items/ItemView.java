package rpg.views.concretes.textual.items;

import rpg.models.items.ItemModel;
import rpg.views.abstracts.items.AbstractItemView;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class ItemView extends AbstractItemView {

    public ItemView(ItemModel model) {
        super(model);
    }

    @Override
    public void use() {
        ItemModel me = getModel();
        System.out.println(me.getName() + " shines.");
    }

}
