package github.jens_eckert.weezo.registration;

import github.jens_eckert.weezo.WeezoMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockReg {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WeezoMod.MODID);

    public static final RegistryObject<Block> WEEZO_BLOCK = BLOCKS.register("weezo_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .mapColor(MapColor.COLOR_MAGENTA))
    );
}
