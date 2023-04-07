package ChainOfResponsability.Chains;

import ChainOfResponsability.Shield;
import Strategy.Character.Character;

public class Shield10 extends Shield{
    public void handleSuccessor(Character character, int damage) {
        int damageAfterShield = damage - 10;

        if (damageAfterShield > 0 && getSuccessor() != null) {
            System.out.println("Shield10: Damage reduced by 10" + damageAfterShield + " damage");
            getSuccessor().handleSuccessor(character, damageAfterShield);
        } else if (damageAfterShield > 0 && getSuccessor() == null) {
            System.out.println("Shield10: Damage reduced by 10");
            System.out.println("New Damage: " + damageAfterShield);
            character.setLife(character.getLife() - damageAfterShield);
        } else {
            System.out.println("Shield10: Character took 0 damage");
        }
    }
}
