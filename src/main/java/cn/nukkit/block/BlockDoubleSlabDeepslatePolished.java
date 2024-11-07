package cn.nukkit.block;

import cn.nukkit.item.ItemTool;
import cn.nukkit.utils.BlockColor;

public class BlockDoubleSlabDeepslatePolished extends BlockDoubleSlabBase {
    
    public BlockDoubleSlabDeepslatePolished() {
        this(0);
    }
    
    public BlockDoubleSlabDeepslatePolished(int meta) {
        super(meta);
    }
    
    @Override
    public int getId() {
        return POLISHED_DEEPSLATE_DOUBLE_SLAB;
    }
    
    @Override
    public int getSingleSlabId() {
        return POLISHED_DEEPSLATE_SLAB;
    }

    @Override
    public int getItemDamage() {
        return 0;
    }

    @Override
    public String getSlabName() {
        return "Double Polished Deepslate Slab";
    }

    @Override
    public double getHardness() {
        return 3.5;
    }
    
    @Override
    public double getResistance() {
        return 6;
    }
    
    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
    
    @Override
    public int getToolTier() {
        return ItemTool.TIER_WOODEN;
    }
    
    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }
    
    @Override
    public BlockColor getColor() {
        return BlockColor.DEEPSLATE_GRAY;
    }
}
