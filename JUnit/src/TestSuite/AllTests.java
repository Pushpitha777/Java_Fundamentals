package TestSuite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import AssertMethodsAndAnnotations.TestCheckPresence;
import AssertMethodsAndAnnotations.TestSort;
import WiproTest.TestStringConcat;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    TestStringConcat.class,
    TestSort.class,
    TestCheckPresence.class
})

public class AllTests {

}