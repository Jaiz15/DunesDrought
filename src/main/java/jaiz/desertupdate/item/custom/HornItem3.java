package jaiz.desertupdate.item.custom;

import jaiz.desertupdate.sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class HornItem3 extends Item {


    public HornItem3(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.TOOT_HORN;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.setCurrentHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), ModSounds.ANCIENT_HORN_03, SoundCategory.PLAYERS, 15.0f, 1.0f);
        user.getItemCooldownManager().set(this, 60);
        return TypedActionResult.success(itemStack, world.isClient());
    }
}
