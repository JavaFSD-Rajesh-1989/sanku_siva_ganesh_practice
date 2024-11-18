class Archer extends Character {
    public Archer(String name, int health, int attackPower, int defense) {
        super(name, health, attackPower, defense);
    }

    @Override
    public void useAbility(Character target) {
        target.takeDamage(getAttackPower());
    }
}
