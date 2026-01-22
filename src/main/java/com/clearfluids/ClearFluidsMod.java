package com.clearfluids;

import net.fabricmc.api.ClientModInitializer;

public class ClearFluidsMod implements ClientModInitializer {
    public static final String MOD_ID = "clearfluids";

    @Override
    public void onInitializeClient() {
        System.out.println("[ClearFluids] Mod loaded!");
    }
}
