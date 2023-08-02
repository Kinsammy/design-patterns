package strategyPattern.character;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("I uses knife to fight");
    }
}
