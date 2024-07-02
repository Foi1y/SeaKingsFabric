package net.foi1y.seakings.client.shader.lodestone.post;

import net.foi1y.seakings.SeaKingsMod;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import team.lodestar.lodestone.systems.postprocess.PostProcessor;

public class TintPostProcessor extends PostProcessor {
    public static final TintPostProcessor INSTANCE = new TintPostProcessor();
    @Override
    public Identifier getPostChainLocation() {
        return new Identifier(SeaKingsMod.MOD_ID, "tint_post");
    }

    @Override
    public void beforeProcess(MatrixStack matrixStack) {
        // Optional: Implement any actions to perform before processing the post-effect
    }

    @Override
    public void afterProcess() {
        // Optional: Implement any actions to perform after processing the post-effect
    }
}
