package strategyPattern.character;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("I uses bow and arrow to fight");
    }
}
