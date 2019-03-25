
import calculate.BMICalculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

    @RunWith(JUnitParamsRunner.class)
    public class BMICalculatorTest {

        @Test
        @Parameters({"70, 180, Normalny", "50, 183, ",
                "90, 175, nadwaga", "150, 17, otyłość", "180, 15, otyłość"})
        public void testDifferentBMI(double masa, double wzrost, String bmiStatus) {
            double bmiExpectedResult = masa / Math.pow(wzrost, 2)*10000;
            String expected = String.format("Your BMI is: %.2f", bmiExpectedResult);
            String expectedInterpretation = String.format("You're %s", bmiStatus);

            BMICalculator bmi = new BMICalculator(wzrost, masa);
            String bmiActualResult = bmi.calculate();
            String bmiActualInterpretation = bmi.interpret();

            assertEquals(expected, bmiActualResult);
            assertEquals(expectedInterpretation, bmiActualInterpretation);
        }

        @Test(expected = IllegalArgumentException.class)
        public void belowZero() {
            BMICalculator bmi = new BMICalculator(11,0);
        }

    }



