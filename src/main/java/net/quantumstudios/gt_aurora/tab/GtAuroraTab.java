package net.quantumstudios.gt_aurora.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.quantumstudios.gt_aurora.item.ModItems;

public class GtAuroraTab extends CreativeTabs {
    public GtAuroraTab()
    {
       super("gt_aurora");
    }

    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.HYPERCONDUCTING_ANTISCHRABIDIC_CIRCUIT);
    }
}