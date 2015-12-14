package rpg.models.characters;

import rpg.models.Model;

/**
 * TODO: Description
 *
 * @author Tititesouris
 */
public class CharacterModel extends Model {

    protected String name;

    protected int level;

    protected transient int health;

    protected int strength;

    protected boolean dead;

    public CharacterModel(String name) {
        this.name = name;
        this.level = 0;
        this.health = 100;
        this.strength = 1;
        this.dead = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

}
