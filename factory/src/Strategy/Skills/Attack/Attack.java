package Strategy.Skills.Attack;

public abstract class Attack {
    private int damage;

    public Attack() {
        this.damage = 0;
    }

    public Attack(int damage) {
        this.damage = damage;
    }

    public abstract String attack();

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
