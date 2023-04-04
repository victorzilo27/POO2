package Characters.Chains;

public class Shield2 extends Shield{
    
    public void processaShield (int valor){
        int dmg = valor - 2;

        if (dmg > 0){
            getSucessor().processaShield(dmg);
        }
        
    };

}
