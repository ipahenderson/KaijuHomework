package Kaijus;

import Vehicles.*;

public abstract class Kaiju {
    protected String name;
    protected int healthValue;
    protected int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    abstract  String roar();

    abstract public void attack(Vehicle vehicle);

    abstract public void takeDamage(int damage);
}
