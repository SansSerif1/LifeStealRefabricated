package me.sansserif.lifestealrefabricated;

import net.fabricmc.api.ClientModInitializer;

public class ClientNotice implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        LifeStealMod.LOGGER.warn("LifeSteal Mod loaded! However, this mod was made for fabric servers. So this wont do anything in your instance.");
    }
}
