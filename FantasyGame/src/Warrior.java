class Warrior extends Character {
    public Warrior(String name, int health, int attackPower, int defense) {
        super(name, health, attackPower, defense);
    }

    @Override
    public void useAbility(Character target) {
        if (target instanceof Dragon) {
            target.takeDamage(getAttackPower() * 2); // Dragon Slayer skill
        } else {
            target.takeDamage(getAttackPower());
        }
    }
}