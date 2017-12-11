package Vehicles;

import Kaijus.Kaiju;

public abstract class Vehicle {
    protected String type;
    protected int healthValue;
    protected int  attackValue;
    protected int superAttackValue;

    public Vehicle(String type, int healthValue, int attackValue, int superAttackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.superAttackValue = superAttackValue;
    }


    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }



    abstract public void attack(Kaiju kaiju);


    abstract public void superattack(Kaiju kaiju);

    abstract public void takeDamage(int damage);


}
