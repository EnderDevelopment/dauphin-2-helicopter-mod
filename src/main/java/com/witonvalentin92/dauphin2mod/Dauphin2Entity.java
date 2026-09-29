package com.witonvalentin92.dauphin2mod;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public
class Dauphin2Entity extends LivingEntity {
    public Dauphin2Entity(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.world.isClient) {
            if (Dauphin2Mod.flyKeyBinding.isPressed()) {
                this.setVelocity(this.getRotationVector().multiply(0.5));
            }
        }
    }

    @Override
    public boolean canBeControlledByRider() {
        return true;
    }

    @Override
    public boolean canBeRiddenInWater() {
        return true;
    }
}
