package github.jens_eckert.weezo.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

public class NutsBlock extends Block {
    public NutsBlock() {
        super(Properties.of()
                .strength(15f, 15f)
                .mapColor(MapColor.COLOR_CYAN)
                .lightLevel(state -> 15)
                .requiresCorrectToolForDrops()
        );

        // registerDefaultState();
    }
}
