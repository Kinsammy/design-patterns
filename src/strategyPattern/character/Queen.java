package strategyPattern.character;

public class Queen extends Character{

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
}
