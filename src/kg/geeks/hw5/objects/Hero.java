package kg.geeks.hw5.objects;

public class Hero {
    private int healthHero;
    private int damageHero;
    private String superPower;


    public Hero(int healthHero, int damageHero, String superPower){
        this.healthHero = healthHero;
        this.damageHero = damageHero;
        this.superPower = superPower;
    }
    public Hero(int healthHero, int damageHero) {
        this.healthHero = healthHero;
        this.damageHero = damageHero;
    }

    public int getHealthHero() {
        return healthHero;
    }


    public int getDamageHero() {
        return damageHero;
    }


    public String getSuperPower() {
        return superPower;
    }

}
