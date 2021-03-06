public class Wizzard extends Character implements ManaUser{


    private int mana;

    @Override
    public void attack(Character target) {
        if (mana >=10) {
            target.takeDamage(30);
            mana -=10 ;
        }
    }

    public Wizzard(String name, Race race) {
        super(10, 20, name, race,40);
        mana = 40;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void setMana(int mana) {
        this.mana = mana;
    }

    public void giveMana(ManaUser target){
        if (health >5) {
            target.restoreMana(5);
        }
    }

    public void restoreMana(int quantity) {
        if (quantity < 0 ) {
            quantity = 0;
        }
        mana += quantity;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format("M> %d", mana);
    }
}
