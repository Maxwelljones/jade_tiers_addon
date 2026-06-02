package com.maxwelljonez.silentgearjadetiers;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaCommonRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public final class SilentGearJadePlugin implements IWailaPlugin {
    public static final ResourceLocation REQUIRED_TIER =
            ResourceLocation.fromNamespaceAndPath(SilentGearJadeTiers.MODID, "required_tier");

    @Override
    public void register(IWailaCommonRegistration registration) {
        // No server data needed for the current implementation.
        // We read client-known block tags.
    }

    @Override
    public void registerClient(IWailaClientRegistration registration) {
        // Register for all blocks. The provider stays silent unless the block belongs
        // to the Silent Gear progression chain.
        registration.registerBlockComponent(SilentGearTierComponentProvider.INSTANCE, Block.class);
    }
}
