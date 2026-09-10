package com.example.examplemod.client;

import com.example.examplemod.ExampleModCommon;

/** Client initialization shared by both loaders. */
public final class ExampleModClient {
    private ExampleModClient() {
    }

    public static void initialize() {
        ExampleModCommon.LOGGER.info("Initializing Example Mod client");
        // Register loader-neutral client behavior here.
    }
}

