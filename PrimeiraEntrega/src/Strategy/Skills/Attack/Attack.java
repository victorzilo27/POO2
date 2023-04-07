package Strategy.Skills.Attack;

public abstract class Attack {
    private int damage;

    public abstract int attack();

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
