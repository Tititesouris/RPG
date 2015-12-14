package rpg.controllers;

import rpg.models.Model;
import rpg.views.abstracts.View;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public abstract class Controller {

    protected Model model;

    protected View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public abstract void update();

    protected abstract Model getModel();

    protected abstract View getView();

}
