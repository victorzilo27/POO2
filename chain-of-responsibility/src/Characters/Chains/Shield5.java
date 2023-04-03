package Characters.Chains;

public class Shield5 extends Shield
{

public void processaShield (int valor){
    int dmg = valor-5;

    if (dmg > 0){
        getSucessor().processaShield(dmg);
    }
}

}