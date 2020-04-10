import Car.Car;
import org.junit.Test;

import static org.junit.Assert.*;

public class parkingTest{
    @Test
     public void unParkIfAlreadyParked_ShouldReturnTrue(){
        Car car = new Car("1234","Sedan");
        parking p = new parking(car);
        p.state = "parked";
        p.park();
        p.unpark();
        assertEquals("unparked", p.IsParkedOrNot());

    }
    @Test
    public void unParkIfAlreadyNotParked_ShouldReturnFalse(){
        Car car = new Car("1234","Sedan");
        parking p = new parking(car);
        p.unpark();
        assertNotEquals("unparked", p.unpark());

    }

}
