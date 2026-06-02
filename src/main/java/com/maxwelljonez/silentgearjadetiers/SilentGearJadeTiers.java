package com.maxwelljonez.silentgearjadetiers;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(SilentGearJadeTiers.MODID)
public final class SilentGearJadeTiers {
    public static final String MODID = "silentgear_jade_tiers";

    public SilentGearJadeTiers(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, SilentGearJadeTiersConfig.SPEC);
    }
}
