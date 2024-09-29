package net.quantumstudios.gt_aurora.block;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

public final class MetaBlocks {

    private MetaBlocks() {}

    public static BlockStandardCasing STANDARD_CASING; // Why can't we just = new BlockStandardCasing(); ??

    public static void init() {
        STANDARD_CASING = new BlockStandardCasing();
        STANDARD_CASING.setRegistryName("standard_casing");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(STANDARD_CASING);
    }

    @SideOnly(Side.CLIENT)
    private static void registerItemModel(@Nonnull Block block) {
        for (IBlockState state : block.getBlockState().getValidStates()) {
            // noinspection DataFlowIssue
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                    block.getMetaFromState(state),
                    new ModelResourceLocation(block.getRegistryName(),
                            gregtech.common.blocks.MetaBlocks.statePropertiesToString(state.getProperties())));
        }
    }

    @SuppressWarnings({ "unused", "unchecked" }) // What does this function even do
    private static <T extends Comparable<T>> String getPropertyName(@Nonnull IProperty<T> property,
                                                                             Comparable<?> value) {
        return property.getName((T) value);
    }
}
