package github.jens_eckert.weezo.items;

import github.jens_eckert.weezo.registration.BlockReg;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class WeezoBlockItem extends BlockItem {
    public WeezoBlockItem() {
        super(BlockReg.WEEZO_BLOCK.get(), new Item.Properties().rarity(Rarity.RARE));
    }
}
