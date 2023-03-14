package kg.geeks.hw5.general;
import kg.geeks.hw5.objects.Boss;
import kg.geeks.hw5.objects.Hero;

public class Main {
    public static void main(String[] args) {
   Boss firstBoss = new Boss();
   firstBoss.setBossHealth(700);
   firstBoss.setBossDamage(50);
   firstBoss.setBossDefence("Magic");
        System.out.println("Boss health: " + firstBoss.getBossHealth() + " Boss damage: " + firstBoss.getBossDamage()
        + " Boss defence type: " + firstBoss.getBossDefence());

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHealthHero());
            System.out.println("Hero damage: " + hero.getDamageHero());
            System.out.println("Hero superpower: " + hero.getSuperPower());
        }
    }
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 10, "Physical");
        Hero hero2 = new Hero(120, 8, "Magic");
        Hero hero3 = new Hero(80, 12);

        Hero[] heroes = { hero1, hero2, hero3 };
        return heroes;
    }
}