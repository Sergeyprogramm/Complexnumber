import java.util.Scanner;

/**
 * Created by Админ on 20.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Complex number program");
        System.out.println("===========================");

        // Setup and print two complex numbers .....

        Complex cA = new Complex( 1.0, -2.0 );
        Complex cB = new Complex( 3.0, 4.0 );

        System.out.println("Complex number cA = " + cA.toString() );
        System.out.println("Complex number cB = " + cB.toString() );

       //Complex addition and substraction .....

        Complex cC = cA.Add(cB);
        System.out.println("Complex   cA + cB = " + cC.toString() );
        Complex cD = cA.Sub( cB );
        System.out.println("Complex   cA - cB = " + cD.toString() );


        // Test complex multiplication and division .....

        Complex cE = cA.Mult( cB );
        System.out.println("Complex   cA * cB = " + cE.toString() );
        Complex cF = cA.Div( cB );
        System.out.println("Complex   cA / cB = " + cF.toString() );
        // Test absolute value function .....

        System.out.println("Complex  cA.Abs() = " + cA.Abs2() );
        System.out.println("Complex  cB.Abs() = " + cB.Abs2() );

        System.out.println("Conjugation = " + cA.Conjugation());
        System.out.println("Conjugation = " + cB.Conjugation());



    }



}