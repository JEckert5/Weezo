package github.jens_eckert.weezo.registration;

import github.jens_eckert.weezo.WeezoMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemReg {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WeezoMod.MODID);

    public static final RegistryObject<Item> WEEZO_ITEM = CreativeTabReg.addToTab(ITEMS.register("weezo_item",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 200, 2), 2f)
                            .build())
                    .rarity(Rarity.EPIC)
            )
    ));

    public static final RegistryObject<BlockItem> WEEZO_BLOCK_ITEM = CreativeTabReg.addToTab(ITEMS.register("weezo_block_item",
            () -> new BlockItem(BlockReg.WEEZO_BLOCK.get(), new Item.Properties().rarity(Rarity.RARE))
    ));

    public static final RegistryObject<BlockItem> NUTS_BLOCK_ITEM = CreativeTabReg.addToTab(ITEMS.register("nuts_block_item",
            () -> new BlockItem(BlockReg.NUTS_BLOCK.get(), new Item.Properties())
    ));
}
