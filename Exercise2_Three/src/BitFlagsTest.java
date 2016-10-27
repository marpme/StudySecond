import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kyon on 27.10.16.
 */
public class BitFlagsTest {

    public BitFlags bf;

    @Before
    public void setUp() throws Exception{
        bf = new BitFlags(38);
    }

    @Test
    public void getStatus() throws Exception {
        assertEquals(38, bf.getStatus());
    }

    @Test
    public void switchOn() throws Exception {
        // switch on the first (zero) bit, because its off.
        bf.switchOn(1); // 38 + 1
        // now switch on the tenth bit ( = 512)
        bf.switchOn(10); // 39 + 512
        assertEquals(512 + 39, bf.getStatus());
    }

    @Test
    public void switchOnException() throws Exception {
        boolean exp = false;
        // try to switch on the 33rd bit (out of range)
        try{
            bf.switchOn(33);
        }catch(IndexOutOfBoundsException e){ exp = true; }
        assertTrue("No exception has been thrown.", exp);
    }

    @Test
    public void switchOnExceptionNegative() throws Exception {
        boolean exp = false;
        // try to switch on the -1st bit (out of range)
        try{
            bf.switchOn(-1);
        }catch(IndexOutOfBoundsException e){ exp = true; }
        assertTrue("No exception has been thrown.", exp);
    }

    @Test
    public void switchOff() throws Exception {
        // switch on the first (zero) bit, because its off.
        bf.switchOff(6); // 2^5 = 32 => 38 - 32 = 6
        assertEquals(6, bf.getStatus());
    }

    @Test
    public void switchOffException() throws Exception {
        boolean exp = false;
        // try to switch on the 33rd bit (out of range)
        try{
            bf.switchOff(33);
        }catch(IndexOutOfBoundsException e){ exp = true; }
        assertTrue("No exception has been thrown.", exp);
    }

    @Test
    public void switchOffExceptionNegative() throws Exception {
        boolean exp = false;
        // try to switch on the -1st bit (out of range)
        try{
            bf.switchOff(-1);
        }catch(IndexOutOfBoundsException e){ exp = true; }
        assertTrue("No exception has been thrown.", exp);
    }

    @Test
    public void swapOff() throws Exception {
        //try to swap off some bits
        bf.swap(6); // 2^5 = 32
        bf.swap(2); // 2^1 = 2
        assertEquals(38 - 34, bf.getStatus());
    }

    @Test
    public void swapOn() throws Exception {
        // try to swap on some bits
        bf.swap(1); // 2^0 = 1
        bf.swap(7); // 2^6 = 64
        assertEquals(38 + 65, bf.getStatus());
    }

    @Test
    public void swapOnException() throws Exception {
        boolean exp = false;
        // try to switch on the 33rd bit (out of range)
        try{
            bf.swap(33);
        }catch(IndexOutOfBoundsException e){ exp = true; }
        assertTrue("No exception has been thrown.", exp);
    }

    @Test
    public void swapOnExceptionNegative() throws Exception {
        boolean exp = false;
        // try to switch on the -1st bit (out of range)
        try{
            bf.swap(-1);
        }catch(IndexOutOfBoundsException e){ exp = true; }
        assertTrue("No exception has been thrown.", exp);
    }

    @Test
    public void isSetOn() throws Exception {
        assertTrue(bf.isSet(3));
    }

    @Test
    public void isSetOff() throws Exception {
        assertTrue(!bf.isSet(4));
    }

    @Test
    public void isSetException() throws Exception {
        boolean exp = false;
        // try to switch on the 33rd bit (out of range)
        try{
            bf.isSet(33);
        }catch(IndexOutOfBoundsException e){ exp = true; }
        assertTrue("No exception has been thrown.", exp);
    }

    @Test
    public void isSetExceptionNegative() throws Exception {
        boolean exp = false;
        // try to switch on the -1st bit (out of range)
        try{
            bf.isSet(-1);
        }catch(IndexOutOfBoundsException e){ exp = true; }
        assertTrue("No exception has been thrown.", exp);
    }
}