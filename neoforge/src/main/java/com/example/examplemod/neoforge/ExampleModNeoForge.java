package com.example.examplemod.neoforge;

import com.example.examplemod.ExampleModCommon;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(ExampleModCommon.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge(IEventBus modEventBus, ModContainer modContainer) {
        ExampleModCommon.initialize();
        // Register NeoForge-specific content and listeners with modEventBus.
    }
}

