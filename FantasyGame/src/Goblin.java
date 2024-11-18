class Goblin extends Character {
    public Goblin(String name, int health, int attackPower, int defense) {
        super(name, health, attackPower, defense);
    }

    @Override
    public void useAbility(Character target) {
        target.takeDamage(getAttackPower());
    }
}