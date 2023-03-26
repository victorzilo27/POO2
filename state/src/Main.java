import Characters.Character;
import Characters.Concrete.Character01;
import Characters.Concrete.Character02;
import Characters.Concrete.Character03;

class Main{
    public static void main(String[] args){
        Character c;

        System.out.println("--- Game Started ---");

        System.out.println("Character 01");
        c = new Character01();
        c.attack();
        c.jump();
        c.run();

        // State: Normal
        System.out.println("Initial Life: " + c.getLife());
        System.out.println("Initial State: " + c.getState().toString());
        System.out.println();
        
        // State: Strong
        c.earnLife(40);
        System.out.println("Life after earning 20: " + c.getLife());
        System.out.println("State after earning 20: " + c.getState().toString());
        System.out.println();

        // State: Danger
        c.loseLife(75);
        System.out.println("Life after losing 50: " + c.getLife());
        System.out.println("State after losing 50: " + c.getState().toString());
        System.out.println();

        // erro -> personagem morte
        // console -> dangerstate
    }
}