package Characters.Chains;
import Characters.Shield;
import Characters.Character;
public class Shield3 extends Shield {
     
    public Shield3(Character character){
        super(character);
    }

    public void processaShield(int valor){
        int dmg = valor-3;
        getCharacter().setLife(getCharacter().getLife() - dmg);
        System.out.println("Shield3 Usado");
    }
}
