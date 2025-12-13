package net.carbonkid.tbf.datagen;

import com.ibm.icu.impl.duration.impl.DataRecord;
import net.carbonkid.tbf.core.ModItems;
import net.carbonkid.tbf.core.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public static final List<ItemConvertible> Lead_SMELTABLES = List.of(ModItems.RAW_LEAD,
            ModBlocks.DEEP_LEAD_ORE, ModBlocks.LEAD_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerBlasting(exporter, Lead_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT,
                0.7f, 100,"lead_ingot" );

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LEAD_INGOT,
                RecipeCategory.DECORATIONS, ModBlocks.LEAD_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_LEAD_BLOCK, 1)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input("S", ModItems.RAW_LEAD)
                .criterion(hasItem(ModItems.RAW_LEAD),conditionsFromItem(ModItems.RAW_LEAD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RAW_LEAD_BLOCK)));

    }
}
