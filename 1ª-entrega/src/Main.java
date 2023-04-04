import Strategy.Character.Character;
import Strategy.Character.Concrete.Character01;


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
        System.out.println();
        System.out.println("Initial State: " + c.getState().toString());
        System.out.println();
        
        // State: Strong
        c.earnLife(40);
        System.out.println("State after earning 40: " + c.getState().toString());
        System.out.println();

        // State: Danger
        c.loseLife(85);
        System.out.println("State after losing 85: " + c.getState().toString());
        System.out.println();

        // State: Dead
        c.loseLife(100);
        System.out.println("State after losing 100: " + c.getState().toString());
    }
}