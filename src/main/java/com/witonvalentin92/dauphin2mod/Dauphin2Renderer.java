package com.witonvalentin92.dauphin2mod;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.util.Identifier;

public
class Dauphin2Renderer extends LivingEntityRenderer<Dauphin2Entity, Dauphin2Model> {
    public Dauphin2Renderer(EntityRendererFactory.Context context) {
        super(context, new Dauphin2Model(), 0.5f);
    }

    @Override
    public Identifier getTexture(Dauphin2Entity entity) {
        return new Identifier(Dauphin2Mod.MOD_ID, "textures/entity/dauphin2.png");
    }
}
