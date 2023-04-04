import Characters.Character;
import Characters.Shield;
import Characters.Concrete.Character01;
import Characters.Chains.*;

class Main{
    public static void main(String[] args){
        Character c;

        System.out.println("--- Game Started ---");

        System.out.println("Character 01");
        c = new Character01();

        Shield shield5 = new Shield5(c);
        Shield shield1 = new Shield1(c);
        Shield shield2 = new Shield2(c);
        Shield shield3 =  new Shield3(c);

        shield5.setSucessor(shield2);
        shield2.setSucessor(shield1);
        shield1.setSucessor(shield3); 
        shield3.setSucessor(null);

        c.setShield(shield5);
        c.attack();
        c.jump();
        c.run();

        c.LoselifeShield(70);
        System.out.println("Life after losing 70 HP using shields: " + c.getLife());
        System.out.println("State: "+c.getState().toString());


    }
}