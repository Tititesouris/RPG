package rpg.controllers.characters;

import rpg.controllers.Controller;
import rpg.misc.Constants;
import rpg.models.characters.CharacterModel;
import rpg.views.abstracts.characters.AbstractCharacterView;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class CharacterController extends Controller {

    public CharacterController(CharacterModel model, AbstractCharacterView view) {
        super(model, view);
    }

    public void attack(CharacterController character) {
        CharacterModel me = getModel();
        CharacterModel target = character.getModel();
        if (Constants.RAND.nextBoolean()) {
            character.getAttackedBy(this);
            me.setLevel(me.getLevel() + 1);
            getView().attack(target, me.getStrength());
        }
        else {
            getView().miss(target);
        }
    }

    private void getAttackedBy(CharacterController character) {
        CharacterModel me = getModel();
        CharacterModel attacker = character.getModel();
        me.setHealth(me.getHealth() - attacker.getStrength());
        if (me.getHealth() <= 0) {
            me.setDead(true);
        }
    }

    @Override
    public void update() {

    }

    @Override
    protected CharacterModel getModel() {
        return (CharacterModel) model;
    }

    @Override
    protected AbstractCharacterView getView() {
        return (AbstractCharacterView) view;
    }

}
