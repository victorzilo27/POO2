package Characters.Chains;
import Characters.Shield;
import Characters.Character;

public class Shield5 extends Shield
{ 

public Shield5(Character character){
    super(character);
}

public void processaShield (int valor){
    int dmg = valor-5;


    if (dmg > 0){
        getSucessor().processaShield(dmg);
        System.out.println("Shield5 Usado");
    }
}

}