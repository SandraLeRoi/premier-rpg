public class Archer extends Character{

    @Override
    public void attack(Character target) {
        if(stamina > 5) {
            int damage = 5 + stamina / 2;
            target.takeDamage(damage);
            stamina -= 5;
        }
    }

    public Archer(String name, Race race) {
        super(10, 40, name, race,30);
    }
}
