package github.jens_eckert.weezo.registration;

import github.jens_eckert.weezo.WeezoMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModTierReg {
    public static final Tier WEEZO = TierSortingRegistry.registerTier(
            new ForgeTier(5, 350, 5f, 4f, 25,
                    ModTagInit.NEEDS_WEEZO_TOOL,
                    () -> Ingredient.of(ItemReg.WEEZO_INGOT::get)),
            new ResourceLocation(WeezoMod.MODID, "weezo"), List.of(Tiers.NETHERITE), List.of()
    );
}
