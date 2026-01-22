package com.clearfluids.mixin;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.FluidRenderer;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(FluidRenderer.class)
public class FluidRendererMixin {
    
    /**
     * Makes water completely transparent by setting alpha to a very low value
     * Works with both vanilla and Sodium
     */
    @ModifyArgs(
        method = "render",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/block/FluidRenderer;vertex(Lnet/minecraft/client/render/VertexConsumer;DDDFFFFFFF)V")
    )
    private void makeFluidsTransparent(Args args) {
        // Get current color values
        float red = args.get(5);
        float green = args.get(6);
        float blue = args.get(7);
        
        // Set alpha to very low for transparency (0.1 = 10% opacity)
        // You can adjust this value: 0.0 = invisible, 1.0 = opaque
        float newAlpha = 0.15f;
        
        // Apply the new alpha
        args.set(8, newAlpha);
    }
}
