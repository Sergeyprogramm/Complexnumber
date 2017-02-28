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
        assertEquals(new Complex(-1.50999, 4.27), a.Mult(b));
        assertEquals(new Complex(-72123.882, 37782.212), a.Mult(c));
        assertEquals(new Complex(-48081.94, 44650.478), c.Mult(b));
    }

    @org.junit.Test
    public void div() throws Exception {
        assertEquals(new Complex(0.84615384615, 1.5), a.Div(b));
        assertEquals(new Complex(0.96956107088, 0.00006114373), a.Div(c));
        assertEquals(new Complex(0.87271846153, 24532.3571429), c.Div(b));
    }

    @org.junit.Test
    public void abs2() throws Exception {

    }

    @org.junit.Test
    public void conjugation() throws Exception {

    }

    /*public static boolean equality( first, double second) {
        double epsilon = 0.0000005;
        return Math.abs(first - second) < epsilon;
    }*/

}