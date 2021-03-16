public class Priest extends Character implements ManaUser{

    private int mana;

    @Override
    public void attack(Character target) {
        target.takeDamage(1);
    }

    public Priest(String name, Race race) {
        super(0, 20, name, race,30);
        mana= 20;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void setMana(int mana) {
        this.mana = mana;
    }

    public void heal (Character target) {
        if (mana >=5){
            target.restoreHealth(5);
            mana -= 5;
        }
    }

    public void heal () {
        heal(this);
    }

    @Override
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
