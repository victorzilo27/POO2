package Characters.Chains;
import Characters.Character;
import Characters.Shield;

public class Shield2 extends Shield{

    public Shield2(Character character){
        super(character);
    }
     
    public void processaShield (int valor){
        int dmg = valor - 2;

        if (dmg > 0){
            getSucessor().processaShield(dmg);
            System.out.println("Shield2 Usado");
        }
        
    };

}
