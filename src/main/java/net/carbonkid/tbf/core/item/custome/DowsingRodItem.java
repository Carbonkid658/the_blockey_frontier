package net.carbonkid.tbf.core.item.custome;

import com.google.common.collect.Multimap;
import net.carbonkid.tbf.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.carbonkid.tbf.util.ModTags.Blocks.DOWSING_ROD_DETECTABLE_BLOCKS;

public class DowsingRodItem extends Item{
    public DowsingRodItem(Settings settings){
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;
            for (int i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockState state = context.getWorld().getBlockState(positionClicked.down(i));

                if(isValuableBlock(state)){
                    outputValuableCoordinates(positionClicked.down(i), player, state.getBlock());
                    foundBlock = true;

                    break;
                }

            }

            if(!foundBlock) {
                player.sendMessage(Text.literal("No Valuables Found"));
            }
        }
        context.getStack().damage(1,context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }

    private void outputValuableCoordinates(BlockPos blockPos, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Found " + "?"), false);
    }

    private boolean isValuableBlock(BlockState state) {
        return state.isIn(DOWSING_ROD_DETECTABLE_BLOCKS);
    }



    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.the-blockey-frontier.dowsing_rod.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }

}

