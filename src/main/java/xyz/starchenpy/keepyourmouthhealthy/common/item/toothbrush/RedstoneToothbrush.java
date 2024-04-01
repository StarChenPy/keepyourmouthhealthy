package xyz.starchenpy.keepyourmouthhealthy.common.item.toothbrush;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

import static xyz.starchenpy.keepyourmouthhealthy.KeepYourMouthHealthy.MOD_ID;

public class RedstoneToothbrush extends AbstractToothbrush {
    public RedstoneToothbrush(Properties item) {
        super(item);
    }

    /**
     * 决定了刷牙所需的时间
     * @param itemStack 物品
     * @return 时间(tick)
     */
    @Override
    @ParametersAreNonnullByDefault
    public int getUseDuration(ItemStack itemStack) {
        return 60;
    }

    @Override
    @ParametersAreNonnullByDefault
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(Component.translatable("tooltip." + MOD_ID + ".redstone_toothbrush"));
    }
}
