package net.bloop.qualityoflife;

import net.bloop.qualityoflife.items.ItemGlassShard;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber(modid = QualityOfLife.MODID)
public class RegistryEvents {

    public static Item itemGlassShard;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        itemGlassShard = (ItemGlassShard)(new ItemGlassShard().setUnlocalizedName("itemGlassShard"));
        registerItem(itemGlassShard, "itemGlassShard");
    }

    private static void registerItem(Item varItemName, String varName)
    {
        varItemName.setRegistryName(varName);
        ForgeRegistries.ITEMS.register(varItemName);
    }
}
