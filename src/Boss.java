public class Boss extends GameEntity{
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Boss - health: " + this.health + ", damage " + this.damage
                + ", weapon type: " + weapon.getType() + " weapon name: " + weapon.getName();
    }
}
