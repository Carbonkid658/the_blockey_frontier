package net.carbonkid.tbf.datagen;

import com.ibm.icu.impl.duration.impl.DataRecord;
import net.carbonkid.tbf.core.ModItems;
import net.carbonkid.tbf.core.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
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

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_LEAD,
                RecipeCategory.DECORATIONS, ModBlocks.RAW_LEAD_BLOCK);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.D0WSING_ROD, 1)
                .input('S', Items.STICK)
                .pattern("S S")
                .pattern("S S")
                .pattern("S S")
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.D0WSING_ROD)));;

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAN, 1)
                .input('S', Items.IRON_NUGGET)
                .input('#', Items.IRON_INGOT)
                .pattern("   ")
                .pattern("S S")
                .pattern(" # ")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CAN)));;


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BEEN_CAN, 1)
                .input('S', ModItems.BEEN)
                .input('#', ModItems.CAN)
                .pattern("SSS")
                .pattern("S#S")
                .pattern("SSS")
                .criterion(hasItem(ModItems.BEEN), conditionsFromItem(ModItems.BEEN))
                .criterion(hasItem(ModItems.CAN), conditionsFromItem(ModItems.CAN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BEEN_CAN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BISCUIT, 1)
                .input('E', Items.EGG)
                .input('W', Items.WHEAT)
                .input('S', Items.SUGAR)
                .input('M', Items.MILK_BUCKET)
                .pattern("   ")
                .pattern("EWS")
                .pattern(" M ")
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BISCUIT)));









    }
}
