package cz.orany.cars;

abstract class AbstractTransmission implements Transmission {

    private final String sound;

    public AbstractTransmission(String sound) {
        this.sound = sound;
    }

    @Override
    public String shift() {
        return sound;
    }
}
