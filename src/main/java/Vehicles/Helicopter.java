package Vehicles;

import Kaijus.Kaiju;

public class Helicopter extends Vehicle{
    public Helicopter(String type, int healthValue, int attackValue, int superAttackValue) {
        super(type, healthValue, attackValue, superAttackValue);
    }

    public String fly(Kaiju kaiju) {
        return this.type + " flies towards " + kaiju.getName();

    }

    @Override
    public void attack(Kaiju kaiju) {
        kaiju.takeDamage(attackValue);
    }

    @Override
    public void superattack(Kaiju kaiju) {
        kaiju.takeDamage(superAttackValue);

    }

    @Override
    public void takeDamage(int damage) {
        this.setHealthValue(getHealthValue() - damage);
    }
}
