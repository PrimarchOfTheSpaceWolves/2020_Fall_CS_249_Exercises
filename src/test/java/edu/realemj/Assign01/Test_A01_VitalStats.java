package edu.realemj.Assign01;
// NOTE: CHANGE realemj to YOUR SITNETID!!!
import edu.realemj.Testing.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_A01_VitalStats {

    @Test()
    public void testMain() {

        String [] allInputs = {
                "Luke\nSkywalker\n19\n160.937\n",
                "Han\nSolo\n32\n176.37\n",
                "  Chew Bacca    200  246.918\n"
        };

        GeneralTesting.OutPack [] correctOutputs = {
                new GeneralTesting.OutPack(
                        "Enter first name:\n" +
                                "Enter last name:\n" +
                                "Enter age:\n" +
                                "Enter weight:\n" +
                                "Name: Luke Skywalker\n" +
                                "Age: 19 years old\n" +
                                "Weight: 160.937 lbs\n",
                        ""),
                new GeneralTesting.OutPack(
                        "Enter first name:\n" +
                                "Enter last name:\n" +
                                "Enter age:\n" +
                                "Enter weight:\n" +
                                "Name: Han Solo\n" +
                                "Age: 32 years old\n" +
                                "Weight: 176.37 lbs\n", ""),
                new GeneralTesting.OutPack(
                        "Enter first name:\n" +
                                "Enter last name:\n" +
                                "Enter age:\n" +
                                "Enter weight:\n" +
                                "Name: Chew Bacca\n" +
                                "Age: 200 years old\n" +
                                "Weight: 246.918 lbs\n", ""),

        };

        for(int i = 0; i < allInputs.length; i++) {
            // Start redirect
            GeneralTesting.StreamPack.getInstance().start(allInputs[i]);

            // Call main
            VitalStats.main(null);

            // Stop redirect
            GeneralTesting.OutPack programOutput = GeneralTesting.StreamPack.getInstance().stop();

            // Compare to correct result
            Assert.assertEquals(programOutput, correctOutputs[i]);
        }
    }
}
