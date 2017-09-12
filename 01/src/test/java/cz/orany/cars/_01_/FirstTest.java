package cz.orany.cars._01_;

import cz.orany.cars.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTest {

    @Test
    public void testLuxurySedan() {
        Engine engine = new GasEngine(55, 8);
        Body body = new Body(Style.SEDAN, 2);
        Transmission transmission = new ManualTransmission(6);
        Car car =  new Car("Luxury Sedan", engine, body, transmission);
        assertEquals("vroom... vroom... vroom... vroom... vroom", car.go());
        assertEquals("sedan with 2 doors", car.getBody().getDescription());
    }

    @Test
    public void testElectrical() {
        Engine engine = new ElectricalMotor(77);
        Body body = new Body(Style.HATCHBACK, 5);
        Car car =  new Car("Electrical Hatchback", engine, body, null);
        assertEquals("humhumhumhumhum", car.go());
        assertEquals("hatchback with 5 doors", car.getBody().getDescription());
    }
}
