package github.jens_eckert.weezo.items;

import github.jens_eckert.weezo.registration.BlockReg;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class NutsBlockItem extends BlockItem {
    public NutsBlockItem() {
        super(BlockReg.NUTS_BLOCK.get(), new Item.Properties().rarity(Rarity.EPIC));
    }
}
