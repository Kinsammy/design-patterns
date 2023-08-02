package strategyPattern.character;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("I uses sword to fight");
    }
}
