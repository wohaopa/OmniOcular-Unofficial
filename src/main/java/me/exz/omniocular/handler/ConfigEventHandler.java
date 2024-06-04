package me.exz.omniocular.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import me.exz.omniocular.network.NetworkHelper;

public class ConfigEventHandler {

    @SubscribeEvent
    public void PlayerLoggedInEvent(PlayerEvent.PlayerLoggedInEvent event) {
        // ConfigMessageHandler.network.sendTo(new ConfigMessage(ConfigHandler.mergedConfig),
        // (net.minecraft.entity.player.EntityPlayerMP) event.player);
        NetworkHelper
            .sendConfigString(XMLConfigHandler.mergedConfig, (net.minecraft.entity.player.EntityPlayerMP) event.player);

        // LogHelper.info("PlayerLoggedInEvent");
        // MinecraftServer.getServer().isDedicatedServer();
        // MinecraftServer.getServer().isSinglePlayer();
    }
}
