package Kaijus;

public class Otachi extends Kaiju{

    public Otachi(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "SCREECH!";
    }

}
