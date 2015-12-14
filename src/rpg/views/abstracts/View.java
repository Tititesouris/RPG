package rpg.views.abstracts;

import rpg.models.Model;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public abstract class View {

    protected Model model;

    public View(Model model) {
        this.model = model;
    }

    protected abstract Model getModel();

}
