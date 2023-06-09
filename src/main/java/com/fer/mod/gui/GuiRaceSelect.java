package com.fer.mod.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;

import java.io.IOException;

public class GuiRaceSelect extends GuiScreen {
    private String title = "Select a race";
    private GuiListRaceSelection raceSelect;
    private GuiButton select;
    private boolean closedWithChoice = false;

    @Override
    public void initGui(){
        this.title = I18n.format("rm.race.select");
        this.raceSelect = new GuiListRaceSelection(this, this.mc, this.width, this.height, 32, this.height-64, 24);
        select = addButton(new GuiButton(0, this.width / 2 - 154, this.height - 52, 150, 20, I18n.format("gui.rm.confirm")));
        addButton(new GuiButton(1, this.width / 2 + 4, this.height - 52, 150, 20, I18n.format("gui.cancel")));
        select.enabled = false;
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if (button.enabled) {
            if (button.id == 0) {
                closedWithChoice = true;
            }
            mc.displayGuiScreen(null);
            mc.setIngameFocus();
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        raceSelect.drawScreen(mouseX, mouseY, partialTicks);
        this.drawCenteredString(this.fontRenderer, title, width / 2, 20, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);

        this.drawCenteredString(this.fontRenderer, "Texto", width / 2, height - 32, 16777215);
        this.drawCenteredString(this.fontRenderer, "FER", width / 2, height - 20, 16777215);
    }
}
