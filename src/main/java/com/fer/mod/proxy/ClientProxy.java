package com.fer.mod.proxy;

import com.fer.mod.event.KeyBindEventHandler;
import com.fer.mod.gui.GuiRaceSelect;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy{
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    @Override
    public void registerGui() {
        //Register key binding for the "Race menu", L by default
        MinecraftForge.EVENT_BUS.register(KeyBindEventHandler.INSTANCE);
    }
    @Override
    public void displayGuiForPlayer(EntityPlayer player) {
        Minecraft.getMinecraft().displayGuiScreen(new GuiRaceSelect());
    }

    @Override
    public EntityPlayer getPlayer() {
        return FMLClientHandler.instance().getClient().player;
    }
}
