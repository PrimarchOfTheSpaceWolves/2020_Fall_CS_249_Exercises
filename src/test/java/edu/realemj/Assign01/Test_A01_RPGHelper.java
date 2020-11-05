package edu.realemj.Assign01;
// NOTE: CHANGE realemj to YOUR SITNETID!!!
import edu.realemj.Testing.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_A01_RPGHelper {

    @Test()
    public void testMain() {

        String [] allInputs = {
                "-1 -1\n",  // Error
                "-1 0\n",   // Error
                "0 -1\n",   // Error
                "0 0\n",    // Hobo
                "0 49\n",   // Hobo
                "49 0\n",   // Hobo
                "0 50\n",   // Wizard
                "50 0\n",   // Berserker
                "50 50\n",  // Knight
                "75 30\n",  // Berserker
                "20 83\n",  // Wizard
                "64 91\n"   // Knight
        };

        GeneralTesting.OutPack [] correctOutputs = {
                // Error cases
                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n",
                        "ERROR: Negative entry!\n"),

                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n",
                        "ERROR: Negative entry!\n"),

                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n",
                        "ERROR: Negative entry!\n"),

                // Regular cases
                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n" +
                                "HOBO!\n",
                        ""),

                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n" +
                                "HOBO!\n",
                        ""),

                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n" +
                                "HOBO!\n",
                        ""),

                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n" +
                                "WIZARD!\n",
                        ""),

                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n" +
                                "BERSERKER!\n",
                        ""),

                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n" +
                                "KNIGHT!\n",
                        ""),

                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n" +
                                "BERSERKER!\n",
                        ""),

                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n" +
                                "WIZARD!\n",
                        ""),

                new GeneralTesting.OutPack(
                        "Enter strength and wisdom:\n" +
                                "KNIGHT!\n",
                        ""),
        };

        for(int i = 0; i < allInputs.length; i++) {
            // Start redirect
            GeneralTesting.StreamPack.getInstance().start(allInputs[i]);

            // Call main
            RPGHelper.main(null);

            // Stop redirect
            GeneralTesting.OutPack programOutput = GeneralTesting.StreamPack.getInstance().stop();

            // Compare to correct result
            Assert.assertEquals(programOutput, correctOutputs[i]);
        }
    }
}
