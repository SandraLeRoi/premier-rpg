public class Warrior extends Character{

    @Override
    public void attack(Character target) {
        if(stamina > 5) {
            target.takeDamage(25);
            stamina -= 5;
        }
    }

    public Warrior( String name, Race race) {
        super(10, 20, name, race,50);
        switch (race) {
            case ELF : stamina = 10; break;
            case ORC: stamina = 50; break;
            case DWARF: stamina = 40; break;
            case HUMAN: stamina = 25; break;
        }
    }
}
