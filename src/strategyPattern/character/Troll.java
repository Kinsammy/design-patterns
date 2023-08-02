package strategyPattern.character;

public class Troll extends Character{

    public Troll(){
        weaponBehavior = new AxeBehavior();
    }
}
