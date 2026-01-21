package org.example.nested;



import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Demonstrates JUnit 5 @TestClassOrder with @Nested test classes.
 * ClassOrderer.ClassName ensures nested classes execute in lexicographic order:
 * Alpha -> Beta -> Gamma
 */
// It is bases on the Order mentioned.
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
class nestedExample {

    @Nested
    @Order(3)
    class Alpha {
        @Test
        void a() {
            System.out.println("Alpha");
            // simple assertion just to have a non-empty test
            assertTrue(1 + 1 == 2, "Alpha.a should pass");
        }
    }

    @Nested
    @Order(1)
    class Beta {
        @Test
        void b() {
            System.out.println("Beta");
            assertTrue("beta".startsWith("b"), "Beta.b should pass");
        }
    }

    @Nested
    @Order(2)
    class Gamma {
        @Test
        void c() {
            System.out.println("Gamma");
            assertTrue(Math.max(3, 2) == 3, "Gamma.c should pass");
        }
    }
}
