package Factory;

import Strategy.Character.Character;

public abstract class Game {
    public abstract Character createCharacter(int type);

    final public void play(){
        Character p1 = createCharacter(1);
        Character p2 = createCharacter(2);
        p1.attack();
        p1.run();
        p2.attack();
    }
}
