package strategyPattern.character;

public class King extends Character {

    public King(){
        weaponBehavior = new SwordBehavior();
    }

}
