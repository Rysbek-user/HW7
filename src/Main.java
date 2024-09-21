public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(200,30),
                new Medic(130, 30, 50),
                        new Warrior(250, 40)};

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic){
                ((Medic)hero).increaseExperience();
                System.out.println("Новое значение healPoints медика: " + ((Medic)hero).getHealPoints());
            }
        }
    }
}