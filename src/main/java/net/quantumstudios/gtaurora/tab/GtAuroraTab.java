package net.quantumstudios.gtaurora.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.quantumstudios.gtaurora.item.ModItems;

public class GtAuroraTab extends CreativeTabs {
    public GtAuroraTab()
    {
       super("gtaurora");
    }

    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.HYPERCONDUCTING_ANTISCHRABIDIC_CIRCUIT);
    }
}