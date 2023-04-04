package Characters.Chains;

public abstract class Shield {
    
private Shield sucessor;

public void setSucessor (Shield sucessor){
    this.sucessor = sucessor;
}

public Shield getSucessor(){
    return this.sucessor;

}

public abstract void processaShield (int valor);

}
