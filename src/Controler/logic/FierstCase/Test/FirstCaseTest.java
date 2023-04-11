package Controler.logic.FierstCase.Test;
import junit.framework.*;

public class FirstCaseTest extends TestCase {
    protected double value1, value2;

    protected void setUp(){
        value1 = 3;
        value2 = 3;
    }

    public void testAdd(){
        double result = value1 + value2;
        assertTrue(result == 6);
    }
}