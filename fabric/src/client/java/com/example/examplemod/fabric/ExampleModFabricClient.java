package com.example.examplemod.fabric;

import com.example.examplemod.client.ExampleModClient;
import net.fabricmc.api.ClientModInitializer;

public final class ExampleModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExampleModClient.initialize();
        // Register Fabric-specific client hooks here.
    }
}

