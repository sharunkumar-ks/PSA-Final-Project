package edu.neu;

import edu.neu.christofides.ChristofidesAlgorithm;
import edu.neu.christofides.Constants;
import edu.neu.utility.ReadDistanceMatrix;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;

import static edu.neu.utilties.DistanceCalculator.calculateDistance;
import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void testChristofidesDefault() throws IOException {
        double[][] weightMatrix = ReadDistanceMatrix.readDistanceMatrix(Constants.DATA_SET_LOCATION_1);
        int[] route = ChristofidesAlgorithm.run(weightMatrix);
        assertSame(route.length, 26);
        assertArrayEquals(route, new int[]{0, 14, 13, 2, 1, 9, 8, 6, 4, 5, 3, 7, 15, 18, 19, 17, 16, 20, 21, 25, 22,
                23, 24, 11, 12, 10});
        assertEquals(calculateDistance(route, weightMatrix), 1095.0);
    }
}
