package com.witonvalentin92.dauphin2mod;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModel;

public
class Dauphin2Model extends EntityModel<Dauphin2Entity> {
    private final ModelPart body;
    private final ModelPart rotor;
    private final ModelPart tailRotor;

    public Dauphin2Model() {
        textureWidth = 128;
        textureHeight = 64;

        body = new ModelPart(this);
        body.setPivot(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 0).addCuboid(-8.0F, -8.0F, -16.0F, 16.0F, 8.0F, 32.0F, 0.0F, false);

        rotor = new ModelPart(this);
        rotor.setPivot(0.0F, 16.0F, 0.0F);
        rotor.setTextureOffset(0, 40).addCuboid(-16.0F, -1.0F, -1.0F, 32.0F, 2.0F, 2.0F, 0.0F, false);

        tailRotor = new ModelPart(this);
        tailRotor.setPivot(0.0F, 16.0F, 16.0F);
        tailRotor.setTextureOffset(0, 44).addCuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setAngles(Dauphin2Entity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        rotor.yaw = animationProgress;
        tailRotor.pitch = animationProgress;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        body.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        rotor.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        tailRotor.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}
