package net.quantumstudios.gtaurora.metatileentities;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

import net.quantumstudios.gtaurora.api.recipe.RecipeMaps;
import net.quantumstudios.gtaurora.api.render.Textures;

import codechicken.lib.render.CCRenderState;
import codechicken.lib.render.pipeline.IVertexOperation;
import codechicken.lib.vec.Matrix4;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.client.renderer.ICubeRenderer;

public class MetaTileEntityNaqReactor extends SimpleGeneratorMetaTileEntity {

    public MetaTileEntityNaqReactor(ResourceLocation metaTileEntityId, ICubeRenderer renderer, int tier) {
        super(metaTileEntityId, RecipeMaps.NAQ_FUEL_CELL_RECIPES, renderer, tier, (a) -> 0, true);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityNaqReactor(this.metaTileEntityId, this.renderer, this.getTier());
    }

    @Override
    protected void renderOverlays(CCRenderState renderState, Matrix4 translation, IVertexOperation[] pipeline) {
        Textures.HYPERSTATIC_CASING.render(renderState, translation, pipeline);
        super.renderOverlays(renderState, translation, pipeline);
    }

    @Override
    public boolean isValidFrontFacing(EnumFacing facing) {
        return true;
    }
}
