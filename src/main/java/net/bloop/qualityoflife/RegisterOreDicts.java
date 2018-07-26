package net.bloop.qualityoflife;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

@EventBusSubscriber
public class RegisterOreDicts {

    @SubscribeEvent
    public static void registerOreDicts(RegistryEvent.Register<IRecipe> event)
    {
        OreDictionary.registerOre("oreCoal", Items.COAL);
        OreDictionary.registerOre("oreCoal", new ItemStack(Items.COAL, 1, 1));
    }
}
