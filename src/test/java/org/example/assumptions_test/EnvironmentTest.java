package org.example.assumptions_test;

import org.example.assumptions.EnvironmentUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.*;

class EnvironmentTest {

    @Test
    void environmentTest() {

        // 1️⃣ Abort test if not running in CI
        assumeTrue(
                System.getenv("CI") != null,
                () -> "Not running in CI environment"
        );

        // 2️⃣ Normal assertion (runs only if assumption passed)
        assertTrue(
                EnvironmentUtil.runOnlyInCi(),
                "CI-specific logic failed"
        );

        // 3️⃣ Conditional assertion (does NOT abort test)
        assumingThat(
                EnvironmentUtil.isWindows(),
                () -> assertTrue(
                        EnvironmentUtil.linuxSpecificCheck(),
                        "Linux-specific check failed"
                )
        );
    }
}

