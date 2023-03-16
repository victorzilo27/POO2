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

        System.out.println("---------------------");
        System.out.println("Character 02");
        c = new Character02();
        c.attack();
        c.jump();
        c.run();

        System.out.println("---------------------");
        System.out.println("Character 03");
        c = new Character03();
        c.attack();
        c.jump();
        c.run();

        System.out.println("--- Game Over ---");
    }
}