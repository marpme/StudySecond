import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by marvinpiekarek on 20/11/2016.
 */
public class MainTest {
    @Test
    public void div() throws Exception {
        Double a = new Double(4);
        assertTrue(a.equals(Main.div(10,2)));
    }

}