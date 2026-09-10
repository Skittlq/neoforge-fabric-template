package com.example.examplemod.fabric;

import com.example.examplemod.ExampleModCommon;
import net.fabricmc.api.ModInitializer;

public final class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleModCommon.initialize();
        // Register Fabric-specific server/common hooks here.
    }
}

