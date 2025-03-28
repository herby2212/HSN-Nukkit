package cn.nukkit.blockentity;

import cn.nukkit.block.BlockID;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class BlockEntityStructureBlock extends BlockEntity {

    public BlockEntityStructureBlock(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    public boolean isBlockEntityValid() {
        return level.getBlockIdAt(chunk, (int) x, (int) y, (int) z) == BlockID.STRUCTURE_BLOCK;
    }
}
