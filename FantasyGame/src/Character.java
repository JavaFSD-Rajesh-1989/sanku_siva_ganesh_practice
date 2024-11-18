
public abstract class Character {
	  private String name;
	    private int health;
	    private int attackPower;
	    private int defense;

	    public Character(String name, int health, int attackPower, int defense) {
	        this.name = name;
	        this.health = health;
	        this.attackPower = attackPower;
	        this.defense = defense;
	    }

	    public String getName() { return name; }
	    public int getHealth() { return health; }
	    public void setHealth(int health) { this.health = health; }
	    public int getAttackPower() { return attackPower; }
	    public int getDefense() { return defense; }

	    public boolean isAlive() {
	        return health > 0;
	    }

	    public void takeDamage(int damage) {
	        this.health -= Math.max(0, damage - defense);
	    }

	    public abstract void useAbility(Character target);
}
