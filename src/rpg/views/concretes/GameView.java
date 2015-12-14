package rpg.views.concretes;

import rpg.models.Model;
import rpg.views.abstracts.View;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class GameView extends View {

    public GameView(Model model) {
        super(model);
    }

    @Override
    protected Model getModel() {
        return model;
    }

}
