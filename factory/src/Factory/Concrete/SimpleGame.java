package Factory.Concrete;

import Factory.Game;
import Strategy.Character.Character;
import Strategy.Character.Concrete.Character01;
import Strategy.Character.Concrete.Character02;
import Strategy.Character.Concrete.Character03;

public class SimpleGame extends Game {
    public Character createCharacter(int type){
        switch(type){
            case 1:
                return new Character01();
            case 2:
                return new Character02();
            case 3:
                return new Character03();
            default:
                return null;
        }
    }
}
