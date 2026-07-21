package AssertMethodsAndAnnotations;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import JunitWithEclipse.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresence() {

        DailyTasks obj = new DailyTasks();

        assertTrue(obj.checkPresence("Wipro Technologies", "Tech"));

        assertFalse(obj.checkPresence("Wipro Technologies", "Java"));
    }
}
