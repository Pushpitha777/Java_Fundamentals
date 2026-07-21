package WiproTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import JunitWithEclipse.DailyTasks;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {

        DailyTasks obj = new DailyTasks();

        assertEquals("Hello World", obj.doStringConcat("Hello", "World"));
    }
}