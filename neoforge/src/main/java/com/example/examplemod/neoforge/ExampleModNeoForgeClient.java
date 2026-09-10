package com.example.examplemod.neoforge;

import com.example.examplemod.ExampleModCommon;
import com.example.examplemod.client.ExampleModClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(value = ExampleModCommon.MOD_ID, dist = Dist.CLIENT)
public final class ExampleModNeoForgeClient {
    public ExampleModNeoForgeClient(ModContainer container) {
        ExampleModClient.initialize();
        // Register NeoForge-specific client hooks here.
    }
}
