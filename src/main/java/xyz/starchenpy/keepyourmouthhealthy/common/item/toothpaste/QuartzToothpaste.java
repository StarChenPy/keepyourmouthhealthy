package xyz.starchenpy.keepyourmouthhealthy.common.item.toothpaste;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import xyz.starchenpy.keepyourmouthhealthy.common.effect.ModEffects;

public class QuartzToothpaste extends AbstractToothpaste {
    public QuartzToothpaste() {
        super(new Item.Properties().durability(12), 4, 0xE9E9E4);
    }

    @Override
    public void effect(LivingEntity entity) {
        cleanTooth(entity);
        entity.addEffect(new MobEffectInstance(ModEffects.CLEAN_ORAL.get(), 9600));
    }
}
