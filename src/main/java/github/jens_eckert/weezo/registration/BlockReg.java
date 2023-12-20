package github.jens_eckert.weezo.registration;

import github.jens_eckert.weezo.WeezoMod;
import github.jens_eckert.weezo.blocks.NutsBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockReg {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WeezoMod.MODID);

    public static final RegistryObject<Block> WEEZO_BLOCK = BLOCKS.register("weezo_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1f, 6.5f)
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .requiresCorrectToolForDrops())
    );

    public static final RegistryObject<Block> NUTS_BLOCK = BLOCKS.register("nuts_block", NutsBlock::new);
}
