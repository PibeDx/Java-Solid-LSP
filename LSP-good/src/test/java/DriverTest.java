import com.josecuentas.Car;
import com.josecuentas.Driver;
import com.josecuentas.ElectricBus;
import com.josecuentas.Vehicle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jcuentast on 14/12/16.
 */
public class DriverTest {

    @Test
    public void testGoCar() {
        Vehicle vehicle = new Car();
        Driver driver = new Driver();
        driver.go(vehicle);
        Assert.assertEquals(2, vehicle.start);
    }

    @Test
    public void testGoElectricBus() {
        Vehicle vehicle = new ElectricBus();
        Driver driver = new Driver();
        driver.go(vehicle);
        Assert.assertEquals(1,vehicle.start);
    }
}
