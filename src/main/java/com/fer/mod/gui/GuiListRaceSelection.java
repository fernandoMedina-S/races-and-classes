package com.fer.mod.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiListExtended;

public class GuiListRaceSelection extends GuiListExtended {

    private final GuiRaceSelect raceSelect;
    private int selected = -1;

    public GuiListRaceSelection(GuiRaceSelect parent, Minecraft client, int widthIn, int heightIn, int topIn, int bottomIn, int slotHeightIn) {
        super(client, widthIn, heightIn, topIn, bottomIn, slotHeightIn);
        raceSelect = parent;

    }

    @Override
    public IGuiListEntry getListEntry(int index) {
        return null;
    }

    @Override
    protected int getSize() {
        return 0;
    }
}
