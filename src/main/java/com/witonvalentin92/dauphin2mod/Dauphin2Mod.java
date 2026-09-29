package com.witonvalentin92.dauphin2mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.glfw.GLFW;

public
class Dauphin2Mod implements ModInitializer {
    public static final String MOD_ID = "dauphin2mod";
    public static final EntityType<Dauphin2Entity> DAUPHIN2_ENTITY_TYPE = Registry.register(
    Registry.ENTITY_TYPE,
    new Identifier(MOD_ID, "dauphin2_entity"),
    FabricEntityTypeBuilder.create(SpawnGroup.MISC, Dauphin2Entity::new).dimensions(EntityDimensions.fixed(3.0f, 1.5f)).build()
    );

    public static KeyBinding flyKeyBinding;

    @Override
    public void onInitialize() {
        flyKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
        "key.dauphin2mod.fly",
        InputUtil.Type.KEYSYM,
        GLFW.GLFW_KEY_F,
        "category.dauphin2mod.dauphin2"
        ));
    }
}
