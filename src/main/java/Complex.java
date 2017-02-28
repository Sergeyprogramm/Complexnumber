/**
 * Created by Админ on 16.02.2017.
 */
public class Complex {
    protected double re, im;


    // Constructor methods ....

    public Complex() {}

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

    /*public double Argument(){
    }

    public Complex QudraticRootNumber(){
        Complex a = new Complex();
        Complex b = new Complex();
        Complex c = new Complex();
        Complex D = new Complex();*/

}
