package com.levented256.surfacemapmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SurfaceMapMod implements ModInitializer {
    public static final String MOD_ID = "surfacemapmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    private static KeyBinding mapKeyBinding;

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Surface Map Mod");
        mapKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.surfacemapmod.map",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_M,
                "key.category.surfacemapmod"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (mapKeyBinding.wasPressed()) {
                LOGGER.info("Surface Map key pressed");
                // Open surface map here
            }
        });
    }
}