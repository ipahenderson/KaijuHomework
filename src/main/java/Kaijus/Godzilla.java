package Kaijus;

import Vehicles.Vehicle;

public class Godzilla extends Kaiju implements IWalk{

    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "RAWR!";
    }

    public String move(Vehicle vehicle) {
        return this.getName() + " hulks towards the " + vehicle.getType();
    }


    @Override
    public void attack(Vehicle vehicle) {
        vehicle.takeDamage(attackValue);

    }

    @Override
    public void takeDamage(int damage) {
        this.setHealthValue(getHealthValue() - damage);
    }

}
