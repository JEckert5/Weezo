package github.jens_eckert.weezo.registration;

import github.jens_eckert.weezo.WeezoMod;
import github.jens_eckert.weezo.items.*;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static github.jens_eckert.weezo.registration.CreativeTabReg.addToTab;

public class ItemReg {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WeezoMod.MODID);

    // ???
    public static final RegistryObject<Item> WEEZO_ITEM = addToTab(
            ITEMS.register("weezo_item", WeezoItem::new),
            CreativeModeTabs.FOOD_AND_DRINKS
    );

    // BLOCKS
    public static final RegistryObject<BlockItem> WEEZO_BLOCK_ITEM = addToTab(
            ITEMS.register("weezo_block", WeezoBlockItem::new
    ), CreativeModeTabs.BUILDING_BLOCKS);

    public static final RegistryObject<BlockItem> NUTS_BLOCK_ITEM = addToTab(
            ITEMS.register("nuts_block", NutsBlockItem::new
    ), CreativeModeTabs.BUILDING_BLOCKS);

    // TOOLS
    public static final RegistryObject<SwordItem> WEEZO_SWORD = addToTab(ITEMS.register("weezo_sword",
            () -> new SwordItem(ModTierReg.WEEZO, 10, 3f, new Item.Properties())
    ), CreativeModeTabs.COMBAT);

    public static final RegistryObject<PickaxeItem> WEEZO_PICKAXE = addToTab(ITEMS.register("weezo_pickaxe",
            () -> new PickaxeItem(ModTierReg.WEEZO, 2, 1.2f, new Item.Properties())
    ), CreativeModeTabs.TOOLS_AND_UTILITIES);

    public static final RegistryObject<HoeItem> WEEZO_HOE = addToTab(ITEMS.register("weezo_hoe",
            () -> new HoeItem(ModTierReg.WEEZO, 1, 1.1f, new Item.Properties())
    ), CreativeModeTabs.TOOLS_AND_UTILITIES);

    // INGREDIENTS
    public static final RegistryObject<Item> WEEZO_ORE_ITEM = addToTab(
            ITEMS.register("weezo_ore_item", WeezoOreItem::new),
            CreativeModeTabs.INGREDIENTS
    );

    public static final RegistryObject<Item> WEEZO_INGOT = addToTab(
            ITEMS.register("weezo_ingot", WeezoIngot::new),
            CreativeModeTabs.INGREDIENTS
    );
}
