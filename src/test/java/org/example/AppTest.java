package org.example;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    /**
     * @return the suite of tests being tested
     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }

    /**
     * Rigourous Test :-)
     */
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all methods");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Before each method");
    }

    @Test
    public void testOne(){
        System.out.println("Test 1 implementation");
    }

    @Test
    public void testTwo(){
        System.out.println("Test 2 implementation");
        assertEquals(2, 1 + 1);
    }


    @AfterEach
    void afterEach(){
        System.out.println("After each method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all methods");
    }
}
