class Sword implements Equipment {
    private String name;
    private int damageBonus;

    public Sword(String name, int damageBonus) {
        this.name = name;
        this.damageBonus = damageBonus;
    }

    @Override
    public void equip(Character character) throws Exception {
        if (!(character instanceof Warrior)) {
            throw new Exception("Only Warriors can equip swords!");
        }
    }

    @Override
    public void useEquipment(Character character) {
        character.takeDamage(damageBonus);
    }
}