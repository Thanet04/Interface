class Interfacenew{

    public static void main(String[] args) {

        Player star = new Player();

        star.attack();
        star.defend();
        star.castspell("Fire ball");
        star.useWeapon();

    }

}
 
interface Character {

    void attack();
    void defend();

}
 
interface Mage{

    void castspell(String spell);

}

interface Warrior{

    void useWeapon();

}
 
class Player implements Character,Mage,Warrior {

    public void attack(){
        System.out.println("The player attacks the enemy.");
    }
    public void defend(){
        System.out.println("The player defends against the enemy's attack.");
    }
    public void castspell(String spell){
        System.out.println("The player casts " + spell);
    }
    public void useWeapon(){
        System.out.println("The player uses a weapon to attack.");
    }
}