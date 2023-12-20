package github.jens_eckert.weezo;

import github.jens_eckert.weezo.registration.BlockReg;
import github.jens_eckert.weezo.registration.CreativeTabReg;
import github.jens_eckert.weezo.registration.ItemReg;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WeezoMod.MODID)
public class WeezoMod {
    public static final String MODID = "weezo";

    public WeezoMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemReg.ITEMS.register(bus);
        BlockReg.BLOCKS.register(bus);
        CreativeTabReg.TABS.register(bus);
    }
}
