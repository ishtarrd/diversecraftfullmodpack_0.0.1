package com.ishtar.modpack.items;


import com.ishtar.modpack.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier STEEL = new ForgeTier(1400, 8, 3f, 20,
            ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL.get()),
            ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL);
}
