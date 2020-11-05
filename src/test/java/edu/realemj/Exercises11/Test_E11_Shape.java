package edu.realemj.Exercises11;
// NOTE: CHANGE realemj to YOUR SITNETID!!!

import edu.realemj.Testing.GeneralTesting;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_E11_Shape {

    @Test()
    public void test_getArea() {
        Shape s = new Shape();
        Assert.assertEquals(4.5, s.getArea());
    }
}
