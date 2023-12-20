package github.jens_eckert.weezo.registration;

import github.jens_eckert.weezo.WeezoMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = WeezoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabReg {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeezoMod.MODID);

    public static final List<Supplier<? extends ItemLike>> TAB_ITEMS = new ArrayList<>();

    public static final HashMap<ResourceKey<CreativeModeTab>, List<Supplier<? extends ItemLike>>> VANILLA_TAB_MOD_MAP = new HashMap<>();

    public static final RegistryObject<CreativeModeTab> WEEZO_TAB = TABS.register("weezo_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.weezo_tab"))
                    .icon(ItemReg.WEEZO_ITEM.get()::getDefaultInstance)
                    .displayItems((displayParameters, output) -> {
                        TAB_ITEMS.forEach(i -> output.accept(i.get()));
                    })
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike, ResourceKey<CreativeModeTab> tab) {
        TAB_ITEMS.add(itemLike);

        VANILLA_TAB_MOD_MAP.computeIfAbsent(tab, k -> new ArrayList<>());
        VANILLA_TAB_MOD_MAP.get(tab).add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> key = event.getTabKey();

        if (VANILLA_TAB_MOD_MAP.containsKey(key)) {
            VANILLA_TAB_MOD_MAP.get(key).forEach(i -> event.accept(i.get()));
        }
    }
}
