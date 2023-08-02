package strategyPattern.character;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("I uses axe to fight");
    }
}
