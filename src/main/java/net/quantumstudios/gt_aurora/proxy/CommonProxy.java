package net.quantumstudios.gt_aurora.proxy;

import gregtech.api.block.VariantItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.quantumstudios.gt_aurora.GtAuroraMod;
import net.quantumstudios.gt_aurora.block.MetaBlocks;

import java.util.Objects;
import java.util.function.Function;

@Mod.EventBusSubscriber(modid = "gt_aurora")
public class CommonProxy
{
    public void registerItemRenderer(Item item, int meta, String id) {}

    public void preLoad() {}

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        GtAuroraMod.getLogger().info("Registering blocks...");
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(MetaBlocks.STANDARD_CASING);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        GtAuroraMod.getLogger().info("Registering Items...");
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(createItemBlock(MetaBlocks.STANDARD_CASING, VariantItemBlock::new));
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }
}
