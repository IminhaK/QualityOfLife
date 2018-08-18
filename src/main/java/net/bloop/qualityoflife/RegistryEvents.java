package net.bloop.qualityoflife;

import net.bloop.qualityoflife.items.ItemGlassShard;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = QualityOfLife.MODID)
public class RegistryEvents {

    public static Item itemGlassShard;
    public static RegistryEvent.Register<Item> itemEvent;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        itemEvent = event;

        itemGlassShard = new ItemGlassShard().setUnlocalizedName("itemGlassShard");
        registerItem(itemGlassShard, "itemglassshard");
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        ModelLoader.setCustomModelResourceLocation(itemGlassShard, 0, new ModelResourceLocation(QualityOfLife.MODID + ":itemglassshard", "inventory"));
    }

    private static void registerItem(Item itemName, String name)
    {
        itemName.setRegistryName(name);
        itemEvent.getRegistry().register(itemName);
    }
}
