package Vehicles;

import Kaijus.*;

public class Jeep extends Vehicle{
    public Jeep(String type, int healthValue, int attackValue, int superAttackValue) {
        super(type, healthValue, attackValue, superAttackValue);
    }

    public String move(Kaiju kaiju) {
        return this.type + " drives towards " + kaiju.getName();

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
