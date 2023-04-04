package Characters.Chains;
import Characters.Character;
import Characters.Shield;
public class Shield1 extends Shield {
    
    public Shield1(Character character){
        super(character);
    }

    public void processaShield(int valor) {
        int dmg = valor-1;

        if(dmg > 0){
            getSucessor().processaShield(dmg);
            System.out.println("Shield1 Usado");
        }
       
    }

}
