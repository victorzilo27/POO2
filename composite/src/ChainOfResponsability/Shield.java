package ChainOfResponsability;

import Strategy.Character.Character;

public abstract class Shield {
    private Shield successor;

    public void setSuccessor(Shield successor) {
        this.successor = successor;
    }

    public Shield getSuccessor() {
        return successor;
    }

    public abstract void handleSuccessor(Character character, int damage);
}
