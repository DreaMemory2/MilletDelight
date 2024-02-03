package com.stalight.milletdelight.screen;

import com.stalight.milletdelight.MilletDelight;
import com.stalight.milletdelight.screen.handler.MilletTableScreenHandler;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MilletTableScreen extends HandledScreen<MilletTableScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(MilletDelight.MODID, "textures/gui/millet_table.png");
    public MilletTableScreen(MilletTableScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        this.titleX = (this.backgroundWidth - this.textRenderer.getWidth(this.title)) / 2;
    }

    @Override
    public void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        // 屏幕在正中间处
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        // 图片的其实位置和宽高
        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
        // 进度条的绘制
        renderProgress(context, x, y);
    }
    private void renderProgress(DrawContext context, int x, int y) {
        if (this.handler.isCrafting()) {
            context.drawTexture(TEXTURE, x + 90, y + 35, 176, 0, this.handler.getScaledProgress(), 28);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
