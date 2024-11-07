package cn.nukkit.block;

public class BlockPressurePlateWarped extends BlockPressurePlateWood {

    public BlockPressurePlateWarped() {
        this(0);
    }

    public BlockPressurePlateWarped(int meta) {
        super(meta);
    }

    @Override
    public String getName() {
        return "Warped Pressure Plate";
    }

    @Override
    public int getId() {
        return WARPED_PRESSURE_PLATE;
    }
}

