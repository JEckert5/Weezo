package github.jens_eckert.weezo.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class WeezoItem extends Item {
    public WeezoItem() {
        super(new Properties()
                .stacksTo(16)
                .food(new FoodProperties.Builder()
                        .nutrition(5)
                        .saturationMod(0.2f)
                        .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 200, 2), 2f)
                        .build())
                .rarity(Rarity.EPIC)
        );
    }
}
