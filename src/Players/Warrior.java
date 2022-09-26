package Players;

//import kg.geektech.game.general.RPG_Game;

import general.RPG_Game;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.CRITICAL_DAMAGE);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int improvement = random.nextInt(4)+2;
        int coeff = RPG_Game.random.nextInt(5) + 2;
        boss.setHealth(boss.getHealth() - this.getDamage() * coeff);
        System.out.println("Warrior hits critically " + this.getDamage() * coeff * improvement );
    }
}
