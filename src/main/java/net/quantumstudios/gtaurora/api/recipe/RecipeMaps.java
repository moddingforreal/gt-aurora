package net.quantumstudios.gtaurora.api.recipe;

import net.quantumstudios.gtaurora.api.gui.GuiTextures;

import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.BlastRecipeBuilder;
import gregtech.api.recipes.builders.FuelRecipeBuilder;
import gregtech.api.recipes.builders.FusionRecipeBuilder;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;

public final class RecipeMaps {

    public static final RecipeMap<SimpleRecipeBuilder> INFINITY_EXTRACTOR_RECIPES = new RecipeMap<>(
            "infinity_extractor", 2, 4, 0, 1, new SimpleRecipeBuilder(), false)
                    .setSlotOverlay(false, false, false, gregtech.api.gui.GuiTextures.FURNACE_OVERLAY_1)
                    .setSlotOverlay(false, false, true, gregtech.api.gui.GuiTextures.INT_CIRCUIT_OVERLAY)
                    .setSlotOverlay(true, false, gregtech.api.gui.GuiTextures.DUST_OVERLAY)
                    .setSound(GTSoundEvents.FIRE);

    public static final RecipeMap<SimpleRecipeBuilder> PNEUMATIC_INFUSER_RECIPES = new RecipeMap<>("pneumatic_infuser",
            1, 1, 3, 1, new SimpleRecipeBuilder(), false)
                    .setSound(GTSoundEvents.BOILER);

    public static final RecipeMap<BlastRecipeBuilder> FORGING_FURNACE_RECIPES = new RecipeMap<>("forging_furnace",
            3, 3, 2, 1, new BlastRecipeBuilder(), false)
                    .setSlotOverlay(false, false, false, gregtech.api.gui.GuiTextures.FURNACE_OVERLAY_1)
                    .setSlotOverlay(false, false, true, gregtech.api.gui.GuiTextures.INT_CIRCUIT_OVERLAY)
                    .setProgressBar(gregtech.api.gui.GuiTextures.PROGRESS_BAR_EXTRUDER, ProgressWidget.MoveType.HORIZONTAL);

    public static final RecipeMap<FusionRecipeBuilder> STAR_SIPHON_RECIPES = new RecipeMap<>("star_siphon",
            1, 1, 1, 1, new FusionRecipeBuilder(), false)
                    .setSlotOverlay(false, false, gregtech.api.gui.GuiTextures.EXTRACTOR_OVERLAY)
                    .setSlotOverlay(true, true, gregtech.api.gui.GuiTextures.LIGHTNING_OVERLAY_2)
                    .setProgressBar(gregtech.api.gui.GuiTextures.PROGRESS_BAR_FUSION, ProgressWidget.MoveType.HORIZONTAL)
                    .setSound(GTSoundEvents.ARC);

    public static final RecipeMap<FusionRecipeBuilder> ANTIMATTER_COMPRESSOR_RECIPES = new RecipeMap<>(
            "antimatter_compressor", 3, 3, 2, 0, new FusionRecipeBuilder(), false)
                    .setSlotOverlay(false, false, false, gregtech.api.gui.GuiTextures.ATOMIC_OVERLAY_1)
                    .setSlotOverlay(false, false, true, gregtech.api.gui.GuiTextures.COMPRESSOR_OVERLAY)
                    .setSlotOverlay(false, true, gregtech.api.gui.GuiTextures.ATOMIC_OVERLAY_2)
                    .setSlotOverlay(true, false, gregtech.api.gui.GuiTextures.ATOMIC_OVERLAY_1)
                    .setProgressBar(gregtech.api.gui.GuiTextures.PROGRESS_BAR_COMPRESS, ProgressWidget.MoveType.HORIZONTAL)
                    .setSound(GTSoundEvents.COMPRESSOR);

    public static final RecipeMap<SimpleRecipeBuilder> NAQ_FUEL_CELL_PACKER_RECIPES = new RecipeMap<>(
            "naq_fuel_cell_packer", 2, 2, 2, 2, new SimpleRecipeBuilder(), false)
                    .setSlotOverlay(false, false, false, gregtech.api.gui.GuiTextures.ATOMIC_OVERLAY_1)
                    .setSlotOverlay(false, false, true, GuiTextures.ROBOT_ARM_OVERLAY)
                    .setSlotOverlay(true, false, gregtech.api.gui.GuiTextures.ATOMIC_OVERLAY_1)
                    .setSlotOverlay(true, false, true, GuiTextures.ROBOT_ARM_OVERLAY)
                    .setSlotOverlay(false, true, gregtech.api.gui.GuiTextures.ATOMIC_OVERLAY_2)
                    .setSlotOverlay(true, true, gregtech.api.gui.GuiTextures.ATOMIC_OVERLAY_2)
                    .setProgressBar(gregtech.api.gui.GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressWidget.MoveType.HORIZONTAL)
                    .setSound(GTSoundEvents.COMPUTATION);

    public static final RecipeMap<FuelRecipeBuilder> NAQ_FUEL_CELL_RECIPES = new RecipeMap<>(
            "naq_fuel_cell", 1, 1, 0, 0, new FuelRecipeBuilder(), false)
                    .setSlotOverlay(false, false, gregtech.api.gui.GuiTextures.ATOMIC_OVERLAY_1)
                    .setSlotOverlay(true, false, gregtech.api.gui.GuiTextures.ATOMIC_OVERLAY_1)
                    .setSound(GTSoundEvents.FURNACE);

    private RecipeMaps() {}
}
