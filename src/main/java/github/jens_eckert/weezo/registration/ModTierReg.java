package github.jens_eckert.weezo.registration;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTierReg {
    public static final ForgeTier WEEZO = new ForgeTier(
            3,
            300,
            1.25f,
            7f,
            15,
            ModTagInit.NEEDS_WEEZO_TOOL,
            () -> Ingredient.of(ItemReg.WEEZO_INGOT::get) // Change this to weezo ingot eventually
    );
}
