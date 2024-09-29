package net.quantumstudios.gtaurora.item;

import net.quantumstudios.gtaurora.GtAuroraMod;
import net.quantumstudios.gtaurora.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(GtAuroraMod.creativeTab);

        ModItems.ITEMS.add(this);
    }
    
    @Override
    public void registerModels()
    {
        GtAuroraMod.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
