package xyz.starchenpy.keepyourmouthhealthy.common.item.toothpaste;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import xyz.starchenpy.keepyourmouthhealthy.common.effect.ModEffects;

public class FlintToothpaste extends AbstractToothpaste {
    public FlintToothpaste(Properties item) {
        super(item);
    }

    @Override
    public void effect(LivingEntity entity) {
        cleanTooth(entity, 4);

        entity.hurt(entity.damageSources().magic(), 2);
        // 加口腔清洁buff
        entity.addEffect(new MobEffectInstance(ModEffects.ORAL_INJURY.get(), 2400));
    }
}
