package com.clearfluids;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClearFluidsMod implements ClientModInitializer {
    public static final String MOD_ID = "clearfluids";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("ClearFluids loaded - Water and Lava are now crystal clear!");
    }
}
