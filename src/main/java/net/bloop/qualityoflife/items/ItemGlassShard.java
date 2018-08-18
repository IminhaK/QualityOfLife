package net.bloop.qualityoflife.items;

import net.bloop.qualityoflife.QualityOfLife;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class ItemGlassShard extends Item{

    public ItemGlassShard()
    {
        setCreativeTab(CreativeTabs.MISC);
        addPropertyOverride(new ResourceLocation(QualityOfLife.MODID, "size"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                return (float)stack.getCount() / (float)stack.getMaxStackSize();
            }
        });
    }
}
