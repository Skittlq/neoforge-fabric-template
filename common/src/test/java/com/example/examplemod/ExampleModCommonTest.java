package com.example.examplemod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleModCommonTest {
    @Test
    void modIdIsStable() {
        assertEquals("examplemod", ExampleModCommon.MOD_ID);
    }
}

