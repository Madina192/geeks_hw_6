public class Main {
    public static void main(String[] args) {
        Boss BigBoss = new Boss();
        BigBoss.setHealth(800);
        BigBoss.setDamage(50);
        Weapon weapon1 = new Weapon();
        weapon1.setType(WeaponType.FIRE);
        weapon1.setName("gun");
        BigBoss.setWeapon(weapon1);
        System.out.println("BigBoss - health: " + BigBoss.getHealth() + ", damage: " + BigBoss.getDamage()
        + ", weapon type: " + weapon1.getType() + ", weapon name: " + weapon1.getName());

        System.out.println("Дополнительное задание------------------------------");
        System.out.println(BigBoss.printInfo());
        Skeleton Garry = new Skeleton();
        Garry.setHealth(1000);
        Garry.setDamage(60);
        Garry.setNumberOfArrows(25);
        Weapon weaponGarry = new Weapon();
        weaponGarry.setType(WeaponType.COLD);
        weaponGarry.setName("knife");
        Garry.setWeapon(weaponGarry);
        Skeleton Jerry = new Skeleton();
        Jerry.setHealth(1200);
        Jerry.setDamage(70);
        Jerry.setNumberOfArrows(30);
        Weapon weaponJerry = new Weapon();
        weaponJerry.setType(WeaponType.THROW);
        weaponJerry.setName("grenade");
        Jerry.setWeapon(weaponJerry);
        System.out.println(Garry.printInfo());
        System.out.println(Jerry.printInfo());
    }
}