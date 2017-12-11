package Kaijus;

public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "RAWR!";
    }
}
