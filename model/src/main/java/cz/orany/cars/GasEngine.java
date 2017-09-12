package cz.orany.cars;

public class GasEngine extends AbstractEngine {

    private final int pistons;

    public GasEngine(double power, int pistons) {
        super(power, "vroom");
        this.pistons = pistons;
    }

}
