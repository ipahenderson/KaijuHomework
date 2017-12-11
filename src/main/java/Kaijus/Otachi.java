package Kaijus;
import Vehicles.*;


public class Otachi extends Kaiju implements IFly{

    public Otachi(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "SCREECH!";
    }


    public String fly(Vehicle vehicle) {
        return this.getName() + " soars towards the " + vehicle.getType();
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
