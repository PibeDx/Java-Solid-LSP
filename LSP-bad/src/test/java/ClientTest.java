import com.josecuentas.Client;
import com.josecuentas.Rectangle;
import com.josecuentas.Square;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by jcuentast on 14/12/16.
 */
public class ClientTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testRectangleArea() throws Exception {
        Rectangle rectangle = new Rectangle();

        Client client = new Client();

        Assert.assertTrue(client.areaVerifier(rectangle));
    }

    @Test
    public void testSquareArea() throws Exception {
        Rectangle rectangle = new Square();

        Client client = new Client();

        exception.expect(Exception.class);
        exception.expectMessage("Bad area!");

        client.areaVerifier(rectangle);
    }
}
