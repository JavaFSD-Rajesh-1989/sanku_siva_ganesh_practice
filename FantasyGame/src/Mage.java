class Mage extends Character {
    public Mage(String name, int health, int attackPower, int defense) {
        super(name, health, attackPower, defense);
    }

    @Override
    public void useAbility(Character target) {
        target.setHealth(target.getHealth() - getAttackPower()); // Bypasses defense
    }
}
