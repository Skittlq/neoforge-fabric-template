package com.example.examplemod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Loader-neutral initialization shared by Fabric and NeoForge. */
public final class ExampleModCommon {
    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private ExampleModCommon() {
    }

    public static void initialize() {
        LOGGER.info("Initializing Example Mod");
        // Register loader-neutral content and services here.
    }
}

