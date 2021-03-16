package net.qorple.dungeonsoplenty.render;

import com.mojang.blaze3d.platform.GlStateManager;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.qorple.dungeonsoplenty.registry.StatusEffectRegistry;
import org.lwjgl.opengl.GL11;
import com.mojang.blaze3d.systems.RenderSystem;

public class FrozenPlayerFeatureRenderer extends FeatureRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {
    private final Identifier iceTexture = new Identifier("textures/block/ice.png");
    private final ModelPart iceCubeModel;

    public FrozenPlayerFeatureRenderer(FeatureRendererContext<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> context) {
        super(context);
        this.iceCubeModel = new ModelPart(16, 16, 0, 0);
        this.iceCubeModel.addCuboid(-10.0F, -15.0F, -10.0F, 20.0F, 40.0F, 20.0F, 0.0F);
    }

    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light, AbstractClientPlayerEntity abstractClientPlayerEntity, float f, float g, float h, float j, float k, float l) {
        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(RenderLayer.getEntitySolid(iceTexture));
        int overlay = LivingEntityRenderer.getOverlay(abstractClientPlayerEntity, 0.0F);

        this.iceCubeModel.copyPositionAndRotation(this.getContextModel().getHead());
        this.iceCubeModel.pivotX = 0.0F;
        this.iceCubeModel.pivotY = 0.0F;
        this.iceCubeModel.pitch = 0.0F;
        this.iceCubeModel.yaw = 0.0F;

        if(abstractClientPlayerEntity.hasStatusEffect(StatusEffectRegistry.FROZEN_EFFECT)) {
            iceCubeModel.render(matrixStack, vertexConsumer, light, overlay);
        }
    }
}
