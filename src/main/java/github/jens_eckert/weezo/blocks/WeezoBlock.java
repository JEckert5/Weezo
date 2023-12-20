package github.jens_eckert.weezo.blocks;

import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;

public class WeezoBlock extends Block {
    public WeezoBlock() {
        super(Properties.of()
                .strength(1f, 6.5f)
                .mapColor(MapColor.COLOR_MAGENTA)
                .requiresCorrectToolForDrops()
        );
    }
}
