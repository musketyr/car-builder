package cz.orany.cars;

public class Car {

    private final String name;
    private final Engine engine;
    private final Body body;
    private final Transmission transmission;

    public Car(String name, Engine engine, Body body, Transmission transmission) {
        this.name = name;
        this.engine = engine;
        this.body = body;
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public Body getBody() {
        return body;
    }

    public String getName() {
        return name;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public String go() {
        StringBuilder builder = new StringBuilder();
        if (engine != null) {
            builder.append(engine.go());
        }
        for (int i = 0; i < 4; i++) {
            if (transmission != null) {
                builder.append(transmission.shift());
            }
            if (engine != null) {
                builder.append(engine.go());
            }
        }
        return builder.toString();
    }
}
