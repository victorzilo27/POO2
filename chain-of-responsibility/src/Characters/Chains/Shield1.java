package Characters.Chains;

public class Shield1 extends Shield {
    
    
    public void processaShield(int valor) {
        int dmg = valor-1;

        if(dmg > 0){
            getSucessor().processaShield(dmg);
        }
       
    }

}
