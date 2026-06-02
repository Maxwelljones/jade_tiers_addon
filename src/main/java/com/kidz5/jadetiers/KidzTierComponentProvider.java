package com.kidz5.jadetiers;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

import java.util.List;

public enum KidzTierComponentProvider implements IBlockComponentProvider {
    INSTANCE;

    private record Tier(int level, String name, String tagPath, int color) {
        TagKey<Block> tag() {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("kidz", tagPath));
        }

        String label() {
            return String.format("Tier %02d - %s", level, name);
        }
    }

    private static final List<Tier> TIERS = List.of(
            new Tier(0, "Wood / Flint / Bone", "needs_tier_0_tool", 0x9A6A35),
            new Tier(1, "Stone", "needs_tier_1_tool", 0xA0A0A0),
            new Tier(2, "Copper", "needs_tier_2_tool", 0xD87945),
            new Tier(3, "Iron", "needs_tier_3_tool", 0xD8D8D8),
            new Tier(4, "Andesite", "needs_tier_4_tool", 0xA08F79),
            new Tier(5, "Zinc", "needs_tier_5_tool", 0xC7D7D9),
            new Tier(6, "Gold", "needs_tier_6_tool", 0xFFD84A),
            new Tier(7, "Rose Gold", "needs_tier_7_tool", 0xF0A080),
            new Tier(8, "Lapis", "needs_tier_8_tool", 0x315CCF),
            new Tier(9, "Brass", "needs_tier_9_tool", 0xD6A83A),
            new Tier(10, "Electrum", "needs_tier_10_tool", 0xFFE36E),
            new Tier(11, "Osmium", "needs_tier_11_tool", 0x8AA6B8),
            new Tier(12, "Steel", "needs_tier_12_tool", 0x666A70),
            new Tier(13, "Obsidian", "needs_tier_13_tool", 0x332044),
            new Tier(14, "Bronze", "needs_tier_14_tool", 0xB2743A),
            new Tier(15, "Diamond", "needs_tier_15_tool", 0x55FFFF),
            new Tier(16, "Refined Obsidian", "needs_tier_16_tool", 0x6A3FA0),
            new Tier(17, "Refined Glowstone", "needs_tier_17_tool", 0xFFD35A),
            new Tier(18, "Netherite", "needs_tier_18_tool", 0x4A424A),
            new Tier(19, "Uranium", "needs_tier_19_tool", 0x6F9E4A),
            new Tier(20, "Yellorium", "needs_tier_20_tool", 0xC9D83E),
            new Tier(21, "Bort", "needs_tier_21_tool", 0x53616D),
            new Tier(22, "Blutonium", "needs_tier_22_tool", 0x3B83D8),
            new Tier(23, "Crimson", "needs_tier_23_tool", 0xB32626),
            new Tier(24, "Late Space", "needs_tier_24_tool", 0x8B6FFF),
            new Tier(25, "Todabonium", "needs_tier_25_tool", 0xC06BFF)
    );

    @Override
    public void appendTooltip(ITooltip tooltip, BlockAccessor accessor, IPluginConfig config) {
        BlockState state = accessor.getBlockState();

        // Highest tier wins if a block accidentally appears in multiple display tags.
        for (int i = TIERS.size() - 1; i >= 0; i--) {
            Tier tier = TIERS.get(i);
            if (state.is(tier.tag())) {
                tooltip.add(
                        Component.literal("⛏ Required: ")
                                .withStyle(ChatFormatting.GRAY)
                                .append(Component.literal(tier.label()).withStyle(style -> style.withColor(tier.color())))
                );
                return;
            }
        }
    }

    @Override
    public ResourceLocation getUid() {
        return KidzJadePlugin.REQUIRED_TIER;
    }
}
