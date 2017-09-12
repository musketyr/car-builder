package cz.orany.cars;

abstract class AbstractEngine implements Engine {

    private final double power;
    private final String sound;

    public AbstractEngine(double power, String sound) {
        this.power = power;
        this.sound = sound;
    }

    @Override
    public double getPower() {
        return power;
    }

    @Override
    public String go() {
        return sound;
    }
}
