package com.levented256.surfacemapmod;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class SurfaceMapScreen extends Screen {
    protected SurfaceMapScreen() {
        super(Text.literal("Surface Map"));
    }

    @Override
    protected void init() {
        super.init();
        // Initialize map screen components
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        // Render the surface map
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (keyCode == GLFW.GLFW_KEY_ESCAPE) {
            this.close();
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }
}