package com.fer.mod.event;

import com.fer.mod.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

//Class made to handle key events
public class KeyBindEventHandler {
    public static final KeyBindEventHandler INSTANCE = new KeyBindEventHandler();
    //New key binding for "Race menu"
    private final KeyBinding keyBinding = new KeyBinding("Race menu",Keyboard.KEY_L, "key.races.gui");

    //Register all the bindings
    private KeyBindEventHandler() {
        ClientRegistry.registerKeyBinding(keyBinding);
    }

    @SubscribeEvent
    public void openGui(InputEvent.KeyInputEvent event){
        if (keyBinding.isKeyDown() && Minecraft.getMinecraft().currentScreen == null){
            Main.proxy.displayGuiForPlayer(Main.proxy.getPlayer());
        }
    }

}
