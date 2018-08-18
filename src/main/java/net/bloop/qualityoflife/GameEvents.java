package net.bloop.qualityoflife;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.concurrent.ThreadLocalRandom;

@EventBusSubscriber
public class GameEvents {

    @SubscribeEvent
    public static void breakGlass(BlockEvent.BreakEvent event)
    {
        BlockPos pos = event.getPos();
        World world = event.getPlayer().getEntityWorld();
        IBlockState state = event.getState();
        EntityPlayer player = event.getPlayer();

        if((state.getBlock() == Blocks.GLASS || state.getBlock() == Blocks.STAINED_GLASS) && !world.isRemote && !player.capabilities.isCreativeMode)
        {
            int min = 2;
            int max = 4;
            int amount = ThreadLocalRandom.current().nextInt(min, max + 1);
            world.spawnEntity(new EntityItem(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(RegistryEvents.itemGlassShard, amount)));
        }
    }
}
