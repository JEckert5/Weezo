package github.jens_eckert.weezo.registration;

import github.jens_eckert.weezo.WeezoMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTagInit {
    public static final TagKey<Block> NEEDS_WEEZO_TOOL = createModTag("needs_weezo_tool");

    private static TagKey<Block> createModTag(String name) {
        return BlockTags.create(new ResourceLocation(WeezoMod.MODID, name));
    }
}
