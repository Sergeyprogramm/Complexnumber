/**
 * Created by Админ on 16.02.2017.
 */
public  class Complex {
    protected double re, im;


    // Constructor methods ....

    public Complex() {}

    public static final Complex NaN = new Complex(Double.NaN, Double.NaN);

    public double getImaginary() {
        return dImaginary;
    }

    private static final double EPS = 1e-12;

    protected double dImaginary;

    protected double dReal;

    public double getReal(){
        return dReal;
    }

    public Complex( double dReal, double dImaginary ) {
        this.re = dReal;
        this.im = dImaginary;
    }



    // Convert complex number to a string ...

    public String toString() {
        if (im >= 0)
            return re + "+" +  im + "i";
        else
            return re + "-" + -im + "i";
    }
// Сумма cA + cB.....

    public Complex Add( Complex cB ) {
        Complex sum = new Complex();

        sum.re = re + cB.re;
        sum.im = im + cB.im;


        return (sum);
    }

    // Разность cA - cB.....

    public Complex Sub( Complex cB ) {
        Complex diff = new Complex();

        diff.re = re - cB.re;
        diff.im = im - cB.im;


        return (diff);
    }

    //Умножение
    public Complex Mult( Complex cB ) {
        Complex prod = new Complex();

        prod.re = re*cB.re - im *cB.im;
        prod.im = im * cB.re + re * cB.im;


        return (prod);
    }

    // Деление  cA / cB.....

    public Complex Div( Complex cB ) {
        Complex div = new Complex();
        double dR, dDen;

        if(Math.abs( cB.re ) >= Math.abs( cB.im )) {
            dR   = cB.im/cB.re;
            dDen = cB.re + dR*cB.im;

            div.re      = (re      + dR*im)/dDen;
            div.im = (im - dR*re)/dDen;
        } else {
            dR   = cB.re/cB.im;

            dDen = cB.im + dR*cB.re;
            div.re      = (dR*re      + im)/dDen;
            div.im = (dR*im - re)/dDen;
        }

        return (div);
    }
    // Модуль

    public double Abs2() {
        double dX, dY, dTemp, dAnswer;

        dX = Math.abs( re );
        dY = Math.abs( im );
        if(dX == 0)
            dAnswer = dY;
        else if(dY == 0)
            dAnswer = dX;
        else
            dAnswer = Math.sqrt(Math.pow(dX,2)+Math.pow(dY,2));
        return ( dAnswer );
    }

    public String Conjugation(){
        this.re = re;
        this.im = -im;
        if (im < 0)
            return re + "-" + -im + "i";
        else
            return re + "+" + im + "i";

    }

    public double Argument(){
        double arg;
        if (re == 0)
            if(im > 0)
                return arg = Math.PI/2;
            else
                return arg = -Math.PI/2;
        else
        if (re > 0)
            return arg = Math.atan(im/re);
        else if (im >= 0)
            return arg = Math.PI + Math.atan2(re,im);
        else
            return arg = -Math.PI + Math.atan(im/re);
            }

    public void quadraticRoot (double a, double b, double c) {
        Complex z1 = new Complex(0.0, 0.0);
        Complex z2 = new Complex(0.0, 0.0);
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            z1.re = (-b + Math.sqrt(d)) / (2 * a);
            z2.re = (-b - Math.sqrt(d)) / (2 * a);
            z1.im = 0.0;
            z2.im = 0.0;
        }
        if (d == 0.0) {
            z1.re = -b / 2 * a;
            z1.im = 0.0;
        }
        if (d < 0) {
            z1.re = -b / 2 * a;
            z1.im = Math.sqrt(-d) / (2 * a);
            z2.re = -b / 2 * a;
            z2.im = -Math.sqrt(-d) / (2 * a);
        }
        System.out.println("A =" + a + " " + "B = " + b + " " + "C = " + c + " " + "D = " + d);
        System.out.println("Z1 = " + z1 + "  " + "Z2 = " + z2);
    }

    /*public boolean equals(Object other) {
        boolean ret;

        if (this  == other) {
            ret = true;
        } else if (other == null) {
            ret = false;
        } else {
            try {
                Complex rhs = (Complex) other;
                if (rhs.isNaN()) {
                    ret = this .isNaN();
                } else {
                    ret = (Double.doubleToRawLongBits(dReal) == Double
                            .doubleToRawLongBits(rhs.getReal()))
                            && (Double.doubleToRawLongBits(dImaginary) == Double
                            .doubleToRawLongBits(rhs
                                    .getImaginary()));
                }
            } catch (ClassCastException ex) {

                ret = false;
            }
        }

        return ret;
    }

    public Complex isNaN() {
        return NaN;
    }



    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }*/






}
