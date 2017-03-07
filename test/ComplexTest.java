import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 1081_1 on 28.02.17.
 */
public class ComplexTest {


    Complex a = new Complex(1.1, 2.1);
    Complex b = new Complex(1.3, 1.4);
    Complex c = new Complex(1.134534, 34345.3);


    @org.junit.Test
    public void add() throws Exception{
        assertEquals(new Complex(2.4, 3.5), a.Add(b));
        assertEquals(new Complex(2.234534, 34247.4), a.Add(c));
        assertEquals(new Complex(2.434534, 34346.7), c.Add(b));
    }

    @org.junit.Test
    public void sub() throws Exception {
        assertEquals(new Complex(0.2, -0.7), b.Sub(a));
        assertEquals(new Complex(-0.34534, -34343.2), a.Sub(c));
        assertEquals(new Complex(-0.165466, 34346.7), c.Sub(b));
        assertEquals(new Complex(0.034534, 34343.2), c.Sub(a));
    }

    @org.junit.Test
    public void mult() throws Exception {
        assertEquals(new Complex(-1.51, 4.27), a.Mult(b));
        assertEquals(new Complex(-72123.882, 37782.212), a.Mult(c));
        assertEquals(new Complex(-48081.94, 44650.478), c.Mult(b));
    }

    @org.junit.Test
    public void div() throws Exception {
        assertEquals(new Complex(1.19, 0.32), a.Div(b));
        assertEquals(new Complex(6.11, 3.2), a.Div(c));
        assertEquals(new Complex(13173.9, 12232.13), c.Div(b));
    }

    @org.junit.Test
    public void abs2() throws Exception {
        assertEquals(new Complex(2.37, 0.0), a.Abs2());
        assertEquals(new Complex(34345.3, 0.0), c.Abs2());
        assertEquals(new Complex(1.91, 0.0), b.Abs2());
    }

    @org.junit.Test
    public void conjugation() throws Exception {
        assertEquals(new Complex(1.1, -2.1), a.Conjugation());
        assertEquals(new Complex(1.3, -1.4), b.Conjugation());
        assertEquals(new Complex(1.134534, -34345.3), c.Conjugation());
    }

    @org.junit.Test
    public void argument() throws Exception {
        assertEquals(new Complex (1.088), a.Argument());
        assertEquals(new Complex(0.822), b.Argument());
        assertEquals(new Complex(1.57), c.Argument());
    }


    @org.junit.Test
    public void quadraticRoot() throws Exception {

    }

}