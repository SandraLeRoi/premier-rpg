public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Hakamoto",Race.DWARF);
        Archer archer = new Archer("Keitaro", Race.HUMAN);
        Wizzard wizzard = new Wizzard("Hana", Race.ELF);
        Priest priest = new Priest("Le pape", Race.ORC);
        System.out.println(archer);
        System.out.println(warrior);
        System.out.println(priest);
        warrior.attack(archer);
        System.out.println("===============");

        archer.attack(warrior);
        System.out.println(archer);
        System.out.println(warrior);
        System.out.println(priest);
        System.out.println("===============");

        priest.heal(archer);

        warrior.attack(archer);
        System.out.println(archer);
        System.out.println(warrior);
        System.out.println(priest);
        System.out.println("===============");

        priest.heal(warrior);

        archer.attack(warrior);
        System.out.println(archer);
        System.out.println(warrior);
    }
}
