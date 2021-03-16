public abstract class Character {
    protected int maxHealth;
    protected int health;
    protected int armor;
    protected int stamina;
    protected String name;
    protected Race race;

    public Character(int armor, int stamina, String name, Race race, int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.armor = armor;
        this.stamina = stamina;
        this.name = name;
        this.race = race;

    }

    public abstract void attack(Character target);

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getStats() {
        int[] stats = {armor, health, stamina};
        return stats;
    }

    public void takeDamage(int damage) {
        damage -= armor;
        if (damage < 0){
            damage = 0;
        }
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int restoreHealth(int healthToRestore) {
        if (healthToRestore < 0) {
            healthToRestore = 0;
        }
        health += healthToRestore;
        if (health > maxHealth){
            health = maxHealth;
        }
        return health;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s: H> %d/%d S> %d", getClass().getName(), getName(), health, maxHealth, stamina);
    }
}
