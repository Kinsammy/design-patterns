package strategyPattern.character;

public class Knight extends Character{

    public Knight(){
        weaponBehavior = new BowAndArrowBehavior();
    }
}
