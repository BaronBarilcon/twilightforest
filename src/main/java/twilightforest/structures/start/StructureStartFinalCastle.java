package twilightforest.structures.start;

import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureComponent;
import twilightforest.TFFeature;
import twilightforest.structures.finalcastle.ComponentTFFinalCastleMain;

import java.util.Random;

import static twilightforest.TFFeature.FINAL_CASTLE;

public class StructureStartFinalCastle extends StructureStartTFAbstract {
    public StructureStartFinalCastle() {
        super();
    }

    public StructureStartFinalCastle(World world, TFFeature feature, Random rand, int chunkX, int chunkZ) {
        super(world, feature, rand, chunkX, chunkZ);
    }

    @Override
    protected StructureComponent makeFirstComponent(World world, TFFeature feature, Random rand, int x, int y, int z) {
        return new ComponentTFFinalCastleMain(FINAL_CASTLE, world, rand, 0, x, y, z);
    }
}